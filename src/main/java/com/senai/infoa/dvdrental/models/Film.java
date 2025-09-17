package com.senai.infoa.dvdrental.models;
import java.time.*;

public class Film {
    private int id;
    private String title;
    private String description;
    private LocalDate releaseYear;
    private int languageId;
    private double rentalDuration;
    private double rentalRate;
    private String length;
    private double replacementCost;
    private double rating;
    private LocalDateTime lastUpdate;
    private byte[] specialFeatures;
    private String fullText;

    // Construtor sem parâmetros
    public Film() {}

    // Construtor com parâmetros
    public Film(String title, String description, LocalDate releaseYear, int languageId, double rentalDuration, double rentalRate, String length, double replacementCost, double rating, LocalDateTime lastUpdate, byte[] specialFeatures, String fullText) {
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.languageId = languageId;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.lastUpdate = lastUpdate;
        this.specialFeatures = specialFeatures;
        this.fullText = fullText;
    }
    // Getters e Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public double getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(double rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public byte[] getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(byte[] specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }
}