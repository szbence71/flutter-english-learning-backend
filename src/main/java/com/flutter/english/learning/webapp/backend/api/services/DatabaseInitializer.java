package com.flutter.english.learning.webapp.backend.api.services;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.DataAccessException;

@Service
public class DatabaseInitializer {
    private final JdbcTemplate jdbcTemplate;

    public DatabaseInitializer(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    public void initializeDatabase() throws IOException {
        addUniqueConstraintIfNotExists();
        loadSqlFile("achievements.sql");
        loadSqlFile("quiz.sql");
        loadSqlFile("word.sql");
    }

    private void loadSqlFile(String filename) throws IOException {
        ClassPathResource resource = new ClassPathResource(filename);

        // Use InputStream to read from classpath for compatibility with JAR packaging
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8))) {
            StringBuilder sqlBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                // Ignore comment lines (optional)
                if (!line.trim().startsWith("--")) {
                    sqlBuilder.append(line).append("\n");
                }
            }

            // Split statements by semicolon
            String[] sqlStatements = sqlBuilder.toString().split(";");
            for (String statement : sqlStatements) {
                String trimmedStatement = statement.trim();
                if (!trimmedStatement.isEmpty()) {
                    jdbcTemplate.update(trimmedStatement);
                }
            }
        }
    }

    private void addUniqueConstraintIfNotExists() {
        // Check if the constraint already exists
        String checkConstraintSql = "SELECT COUNT(*) FROM information_schema.TABLE_CONSTRAINTS " +
                "WHERE TABLE_NAME = 'quiz_options' AND CONSTRAINT_NAME = 'unique_quiz_option' AND TABLE_SCHEMA = DATABASE()";
        
        Integer count = jdbcTemplate.queryForObject(checkConstraintSql, Integer.class);

        // If the constraint does not exist, add it
        if (count != null && count == 0) {
            String addConstraintSql = "ALTER TABLE quiz_options ADD CONSTRAINT unique_quiz_option UNIQUE (quiz_qid, options)";
            try {
                jdbcTemplate.update(addConstraintSql);
                System.out.println("Unique constraint added successfully.");
            } catch (DataAccessException e) {
                // Handle error in case constraint creation fails
                System.err.println("Error adding unique constraint: " + e.getMessage());
            }
        } else {
            System.out.println("Constraint 'unique_quiz_option' already exists.");
        }
    }
}
