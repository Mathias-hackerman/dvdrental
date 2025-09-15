package com.senai.infoa.dvdrental.models;
import java.time.LocalDateTime;

public class Address {
    private int id;
    private String address;
    private String address2;
    private String district;
    private String city_id;
    private int postalCode;
    private String phone;
    private LocalDateTime lastUpdate;

    public Address() {}
    public Address(String address, String address2, String district, String city_id, int postalCode, String phone, LocalDateTime lastUpdate) {
        this.address = address;
        this.address2 = address2;
        this.district = district;
        this.city_id = city_id;
        this.postalCode = postalCode;
        this.phone = phone;
        this.lastUpdate = lastUpdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

