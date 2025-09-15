package com.senai.infoa.dvdrental.models;
import java.time.LocalDateTime;

public class Country {
    private int id;
    private String country;
    private LocalDateTime lastUpdate;

    public Country() {}

    public Country(String country, LocalDateTime lastUpdate) {
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
