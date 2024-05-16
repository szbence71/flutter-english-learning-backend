package com.flutter.english.learning.webapp.backend.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flutter.english.learning.webapp.backend.api.entities.Word;
import com.flutter.english.learning.webapp.backend.api.repositories.WordRepository;

@RestController
public class WordController {
    @Autowired
    private WordRepository wordRepository;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value = "/getallwords", produces = "application/json;charset=UTF-8")
    public List<Word> getAllWords() {
        return wordRepository.findAll();
    }
}
