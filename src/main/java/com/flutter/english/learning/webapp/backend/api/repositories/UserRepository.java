package com.flutter.english.learning.webapp.backend.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flutter.english.learning.webapp.backend.api.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    User findByUsernameAndPassword(String username, String password);
    User findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    User findByUid(Integer uid);
    User findBySessionId(String sessionId);
}
