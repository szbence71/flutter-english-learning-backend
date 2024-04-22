package com.flutter.english.learning.webapp.backend.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.flutter.english.learning.webapp.backend.api.entities.Achievement;
import com.flutter.english.learning.webapp.backend.api.entities.User;
import com.flutter.english.learning.webapp.backend.api.repositories.AchievementRepository;
import com.flutter.english.learning.webapp.backend.api.repositories.UserRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AchievementController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AchievementRepository achievementRepository;


    @CrossOrigin(origins="http://localhost:8080")
    @PostMapping(value = "/achievement/validate", produces = "application/json;charset=UTF-8")
    public List<Achievement> validateAchievement(@RequestBody String sessionId) {
        User user = userRepository.findBySessionId(sessionId);
        List<Achievement> validatedAchievements = new ArrayList<Achievement>();
        return validatedAchievements;
    }

    @CrossOrigin(origins="http://localhost:8080")
    @GetMapping(value = "/achievements", produces = "application/json;charset=UTF-8")
    public List<Achievement> getAchievements() {
        List<Achievement> achievements = achievementRepository.findAll();
        return achievements;
    }
    
}
