package com.flutter.english.learning.webapp.backend.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UserWord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid")
    private User user;

    private String original;
    private String translated;

    public Integer getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getOriginal() {
        return original;
    }

    public String getTranslated() {
        return translated;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
