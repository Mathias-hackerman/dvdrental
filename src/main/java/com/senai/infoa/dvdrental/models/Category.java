package com.senai.infoa.dvdrental.models;
import java.time.LocalDateTime;

public class Category {
    private int id;
    private String name;
    private LocalDateTime lastUpdate;

    public Category() {}

    public Category(String name, LocalDateTime lastUpdate) {
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}