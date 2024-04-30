package com.flutter.english.learning.webapp.backend.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping(value = "/achievement/validate", produces = "application/json;charset=UTF-8")
    public List<Achievement> validateAchievement(@RequestBody User oldUser) {
        User user = userRepository.findBySessionId(oldUser.getSessionId());
        if (user == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "USER_NOT_FOUND");
        }
    
        try {
            List<Achievement> validatedAchievements = new ArrayList<>();
            List<Achievement> allAchievements = achievementRepository.findAll();
    
            for (Achievement achievement : allAchievements) {
                // Validate specific achievements based on IDs and user's games played
                if (achievement.getAid() == 1 && user.getGamesPlayed() >= 0 && !user.getAchievements().contains(achievement)) {
                    // First login achievement
                    achievement.setIsTrue(true);
                    user.getAchievements().add(achievement);
                    validatedAchievements.add(achievement);
                } else if (achievement.getAid() == 2 && user.getGamesPlayed() >= 5 && !user.getAchievements().contains(achievement)) {
                    // Play 5 games achievement
                    achievement.setIsTrue(true);
                    user.getAchievements().add(achievement);
                    validatedAchievements.add(achievement);
                } else if (achievement.getAid() == 3 && user.getGamesPlayed() >= 50 && !user.getAchievements().contains(achievement)) {
                    // Play 50 games achievement
                    achievement.setIsTrue(true);
                    user.getAchievements().add(achievement);
                    validatedAchievements.add(achievement);
                }
            }
    
            userRepository.save(user);
    
            return validatedAchievements;
        } catch (DataIntegrityViolationException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "DATA_INTEGRITY_VIOLATION");
        }
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping(value = "/userachievements", produces = "application/json;charset=UTF-8")
    public List<Achievement> getUserAchievements(@RequestBody User oldUser) {
        User user = userRepository.findBySessionId(oldUser.getSessionId());
        if (user == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "USER_NOT_FOUND");
        }

        List<Achievement> allAchievements = achievementRepository.findAll();

        for (Achievement achievement : allAchievements) {
            achievement.setIsTrue(false);
            if (user.getAchievements().contains(achievement)) {
                achievement.setIsTrue(true);
            }
        }

        return allAchievements;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value = "/achievements", produces = "application/json;charset=UTF-8")
    public List<Achievement> getAchievements() {
        return achievementRepository.findAll();
    }
}
