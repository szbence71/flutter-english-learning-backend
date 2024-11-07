package com.flutter.english.learning.webapp.backend.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.flutter.english.learning.webapp.backend.api.entities.Quiz;
import com.flutter.english.learning.webapp.backend.api.repositories.QuizRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class QuizController {
    @Autowired
    private QuizRepository quizRepository;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value = "/getallquiz", produces = "application/json;charset=UTF-8")
    public List<Quiz> getAllQuiz() {
        List<Quiz> quizList = quizRepository.findByHard(false);
    return quizList;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value = "/getallhardquiz", produces = "application/json;charset=UTF-8")
    public List<Quiz> getAllHardQuiz() {
        List<Quiz> quizList = quizRepository.findByHard(true);
    return quizList;
    }
}