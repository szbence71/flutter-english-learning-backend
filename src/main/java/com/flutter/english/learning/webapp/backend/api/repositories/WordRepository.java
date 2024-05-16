package com.flutter.english.learning.webapp.backend.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flutter.english.learning.webapp.backend.api.entities.Word;

public interface WordRepository extends JpaRepository<Word, Long> {
    
}
