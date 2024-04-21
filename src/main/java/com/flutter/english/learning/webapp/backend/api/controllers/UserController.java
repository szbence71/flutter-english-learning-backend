package com.flutter.english.learning.webapp.backend.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.flutter.english.learning.webapp.backend.api.repositories.UserRepository;
import com.flutter.english.learning.webapp.backend.api.entities.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController

public class UserController {
    @Autowired
    private UserRepository userRepository;
    
    @PostMapping("/register")
    public User Register(@RequestBody User user) {
        return userRepository.save(user);
    }
    
    @PostMapping("/login")
    public User Login(@RequestBody User user) {       
        User oldUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        return oldUser;
    }
    
}
