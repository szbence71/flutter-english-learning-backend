package com.flutter.english.learning.webapp.backend.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flutter.english.learning.webapp.backend.api.entities.Word;

public interface WordRepository extends JpaRepository<Word, Long> {
    List<Word> findByHard(Boolean hard);
}
