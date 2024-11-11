package com.flutter.english.learning.webapp.backend.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints =  @UniqueConstraint(columnNames = { "original" }))
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long wid;
    String original;
    String translated;
    Boolean hard;
    String type;

    public Word() {
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

    public Boolean getHard() {
        return hard;
    }

    public void setHard(Boolean hard) {
        this.hard = hard;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
