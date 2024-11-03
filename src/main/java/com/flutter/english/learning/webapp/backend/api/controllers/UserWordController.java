package com.flutter.english.learning.webapp.backend.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.flutter.english.learning.webapp.backend.api.entities.User;
import com.flutter.english.learning.webapp.backend.api.entities.UserWord;
import com.flutter.english.learning.webapp.backend.api.repositories.UserRepository;
import com.flutter.english.learning.webapp.backend.api.repositories.UserWordRepository;

@RestController
public class UserWordController {

    @Autowired
    private UserWordRepository userWordRepository;
    @Autowired
    private UserRepository userRepository;

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping(value = "/adduserwords", produces = "application/json;charset=UTF-8")
    public UserWord addUserWord(@RequestBody UserWord userWord) {
        userWord.setUser(userRepository.findBySessionId(userWord.getUser().getSessionId()));
        UserWord savedUserWord = userWordRepository.save(userWord);
        return savedUserWord;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping(value = "/getuserwords", produces = "application/json;charset=UTF-8")
    public List<UserWord> getUserWordsByUserId(@RequestBody User oldUser) {
        User user = userRepository.findBySessionId(oldUser.getSessionId());
        if (user == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "USER_NOT_FOUND");
        }
        List<UserWord> userWords = userWordRepository.findByUser(user);
        return userWords;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping(value = "/deleteuserword/{userWordId}", produces = "application/json;charset=UTF-8")
    public ResponseEntity<?> deleteUserWord(@PathVariable Integer userWordId) {
        userWordRepository.deleteById(userWordId);
        return ResponseEntity.ok().build();
    }
}
