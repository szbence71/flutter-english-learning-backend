package com.flutter.english.learning.webapp.backend.api.entities;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "username", "email", "achievements" }) })
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

    Integer gamesPlayed = 0;
    Integer hardGamesPlayed = 0;

    @ManyToMany
    private Set<Achievement> achievements;

    @JsonManagedReference
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserWord> userWords;

    public User() {
    }

    protected User(String username, String password) {
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

    public Set<Achievement> getAchievements() {
        return achievements;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getHardGamesPlayed() {
        return hardGamesPlayed;
    }

    public void setHardGamesPlayed(Integer hardGamesPlayed) {
        this.hardGamesPlayed = hardGamesPlayed;
    }

    public List<UserWord> getUserWord() {
        return userWords;
    }

    public void setUserWord(List<UserWord> userWords) {
        this.userWords = userWords;
    }
}