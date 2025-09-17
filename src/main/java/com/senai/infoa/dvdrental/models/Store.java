package com.senai.infoa.dvdrental.models;
import java.time.*;
public class Store {
    private int id;
    private int managerStaffId;
    private int addressId;
    private LocalDateTime lastUpdate;
    // Construtor sem parâmetros
    public Store() {}
    // Construtor com parâmetros
    public Store(int managerStaffId, int addressId, LocalDateTime lastUpdate) {
        this.managerStaffId = managerStaffId;
        this.addressId = addressId;
        this.lastUpdate = lastUpdate;
    }
    // Getters e Setters
    public int getManagerStaffId() {
        return managerStaffId;
    }
    public void setManagerStaffId(int managerStaffId) {
        this.managerStaffId = managerStaffId;
    }
    public int getAddressId() {
        return addressId;
    }
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}

