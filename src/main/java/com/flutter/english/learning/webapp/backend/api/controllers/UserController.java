package com.flutter.english.learning.webapp.backend.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.flutter.english.learning.webapp.backend.api.repositories.UserRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flutter.english.learning.webapp.backend.api.entities.User;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController

public class UserController {
    @Autowired
    private UserRepository userRepository;
    
    @CrossOrigin(origins="http://localhost:8080")
    @PostMapping("/register")
    public User Register(@RequestBody User user) {
        boolean emailTaken = userRepository.existsByEmail(user.getEmail());
        boolean usernameTaken = userRepository.existsByUsername(user.getUsername());
        if (usernameTaken) throw new ResponseStatusException(
            HttpStatus.CONFLICT, "USERNAME_TAKEN"
        );
        if (emailTaken) throw new ResponseStatusException(
            HttpStatus.CONFLICT, "EMAIL_TAKEN"
        );
        return userRepository.save(user);
    }
    
    @CrossOrigin(origins="http://localhost:8080")
    @PostMapping("/login")
    public User Login(@RequestBody User user) {    
        User oldUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (oldUser == null) throw new ResponseStatusException(
            HttpStatus.NOT_FOUND, "USER_NOT_FOUND"
        );
        return oldUser;
    }
}
