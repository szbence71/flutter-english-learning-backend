package com.flutter.english.learning.webapp.backend.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
        return wordRepository.findByHard(false);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value = "/getallhardwords", produces = "application/json;charset=UTF-8")
    public List<Word> getAllHardWords() {
        return wordRepository.findByHard(true);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value = "/getallwordsbytype", produces = "application/json;charset=UTF-8")
    public List<Word> getAllWordsByType(@RequestParam("type") String type) {
        return wordRepository.findByHardAndType(false, type);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value = "/getallhardwordsbytype", produces = "application/json;charset=UTF-8")
    public List<Word> getAllHardWordsByType(@RequestParam("type") String type) {
        return wordRepository.findByHardAndType(true, type);
    }
}
