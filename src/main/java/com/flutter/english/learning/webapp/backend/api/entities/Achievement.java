package com.flutter.english.learning.webapp.backend.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints =  @UniqueConstraint(columnNames = { "strid" }))
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer aid; 

    String title;
    String description;
    String strid;
    boolean isTrue;

    public Achievement() {
    }

    protected Achievement(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Integer getAid() {
        return aid;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(boolean isTrue) {
        this.isTrue = isTrue;
    }

    public String getStrid() {
        return strid;
    }
}
