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
    private Bytea specialFeatures;
    private String fullText;
}

