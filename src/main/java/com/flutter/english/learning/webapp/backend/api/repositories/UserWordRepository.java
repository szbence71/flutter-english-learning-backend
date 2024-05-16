package com.flutter.english.learning.webapp.backend.api.repositories;

import com.flutter.english.learning.webapp.backend.api.entities.User;
import com.flutter.english.learning.webapp.backend.api.entities.UserWord;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserWordRepository extends JpaRepository<UserWord, Integer> {
    List<UserWord> findByUser(User user);
}

