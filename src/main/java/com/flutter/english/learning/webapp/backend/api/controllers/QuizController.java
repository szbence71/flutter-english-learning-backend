package com.flutter.english.learning.webapp.backend.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import com.flutter.english.learning.webapp.backend.api.entities.Quiz;
import com.flutter.english.learning.webapp.backend.api.entities.User;
import com.flutter.english.learning.webapp.backend.api.repositories.QuizRepository;
import com.flutter.english.learning.webapp.backend.api.repositories.UserRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class QuizController {
    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private UserRepository userRepository;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value = "/getallquiz", produces = "application/json;charset=UTF-8")
    public List<Quiz> getAllQuiz() {
        List<Quiz> quizList = quizRepository.findAll();
    return quizList;
    }
    
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping(value = "/increaserusergamesplayed", produces = "application/json;charset=UTF-8")
    @ResponseStatus(value = HttpStatus.OK)
    public Integer postMethodName(@RequestBody User user) {
        User oldUser = userRepository.findBySessionId(user.getSessionId());
        oldUser.setGamesPlayed(oldUser.getGamesPlayed()+1);
        userRepository.flush();
        userRepository.save(oldUser);
        return oldUser.getGamesPlayed();
    }
}