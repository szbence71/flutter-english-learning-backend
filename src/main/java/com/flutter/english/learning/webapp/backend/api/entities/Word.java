package com.flutter.english.learning.webapp.backend.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long wid;
    String original;
    String translated;

    private Word() {
    }

    public Long getWid() {
        return wid;
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
}
