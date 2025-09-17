package com.senai.infoa.dvdrental.models;
import java.time.*;

public class Language {
    private int id;
    private String language;
    private LocalDateTime lastUpdate;
    // Construtor sem parâmetros
    public Language() {}
    // Construtor com parâmetros
    public Language(String language, LocalDateTime lastUpdate) {
        this.language = language;
        this.lastUpdate = lastUpdate;
    }
    // Getters e Setters
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
}

