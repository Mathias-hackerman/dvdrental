package com.senai.infoa.dvdrental.models;
import java.time.LocalDateTime;

public class City {
    private int id;
    private String city;
    private int countryId;
    private LocalDateTime lastUpdate;

    public City() {}

    public City(String city, int countryId, LocalDateTime lastUpdate) {
        this.city = city;
        this.countryId = countryId;
        this.lastUpdate = lastUpdate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountry_id() {
        return countryId;
    }

    public void setCountry_id(int countryId) {
        this.countryId = countryId;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}