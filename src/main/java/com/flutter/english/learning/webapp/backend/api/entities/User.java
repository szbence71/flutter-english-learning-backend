package com.flutter.english.learning.webapp.backend.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.UniqueConstraint;
import jakarta.servlet.http.HttpSession;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"username", "email"})})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer uid;

    String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    String password;

    @Transient
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    String passwordConfirmation;

    String sessionId;

    private User(){
    }

    protected User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
        return email;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUid() {
        return uid;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}