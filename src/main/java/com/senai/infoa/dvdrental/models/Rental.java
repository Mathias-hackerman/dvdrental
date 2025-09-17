package com.senai.infoa.dvdrental.models;
import java.time.*;

public class Rental {
    private int id;
    private LocalDate rentalDate;
    private int inventoryId;
    private int customerId;
    private LocalDate returnDate;
    private int staffId;
    private LocalDateTime lastUpdate;

    // Construtor sem parâmetros
    public Rental() {}
    // Construtor com parâmetros
    public Rental(LocalDate rentalDate, int inventoryId, int customerId, LocalDate returnDate, int staffId, LocalDateTime lastUpdate) {
        this.rentalDate = rentalDate;
        this.inventoryId = inventoryId;
        this.customerId = customerId;
        this.returnDate = returnDate;
        this.staffId = staffId;
        this.lastUpdate = lastUpdate;
    }
    // Getters e Setters
    public LocalDate getRentalDate() {
        return rentalDate;
    }
    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }
    public int getInventoryId() {
        return inventoryId;
    }
    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
}

