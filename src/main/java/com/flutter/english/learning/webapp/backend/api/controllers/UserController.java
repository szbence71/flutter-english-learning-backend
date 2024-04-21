package com.flutter.english.learning.webapp.backend.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.flutter.english.learning.webapp.backend.api.repositories.UserRepository;
import com.flutter.english.learning.webapp.backend.api.entities.User;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

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
        String encodedPassword = passwordEncoder().encode(user.getPassword());
        user.setPassword(encodedPassword);
        System.out.println(user.getPassword());
        System.out.println(encodedPassword);
        return userRepository.save(user);
    }
    
    @CrossOrigin(origins="http://localhost:8080")
    @PostMapping("/login")
    public User Login(@RequestBody User user) {
        User oldUser = userRepository.findByUsername(user.getUsername());
        if (oldUser == null) throw new ResponseStatusException(
            HttpStatus.NOT_FOUND, "USER_NOT_FOUND"
        );
        if (passwordEncoder().matches(user.getPassword(), oldUser.getPassword())) return oldUser;
        throw new ResponseStatusException(
            HttpStatus.BAD_REQUEST, "WRONG_PASSWORD"
        );
    }

    @Bean
    private PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
