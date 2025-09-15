package com.senai.infoa.dvdrental.models;
import java.time.LocalDateTime;

public class Customer {
    private int id;
    private int storeId;
    private String firstName;
    private String lastName;
    private String email;
    private int addressId;
    private boolean activeBool;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdate;
    private String active;

    public Customer() {}

    public Customer(int storeId, String firstName, String lastName, String email, int addressId, boolean activeBool, LocalDateTime createDate, LocalDateTime lastUpdate, String active) {
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressId = addressId;
        this.activeBool = activeBool;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.active = active;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public boolean isActiveBool() {
        return activeBool;
    }

    public void setActiveBool(boolean activeBool) {
        this.activeBool = activeBool;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}

