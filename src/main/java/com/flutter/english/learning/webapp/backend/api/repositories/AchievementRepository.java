package com.flutter.english.learning.webapp.backend.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flutter.english.learning.webapp.backend.api.entities.Achievement;

public interface AchievementRepository extends JpaRepository<Achievement, Integer> {
    Achievement findByAid(Integer aid);

    List<Achievement> findAll();
}
