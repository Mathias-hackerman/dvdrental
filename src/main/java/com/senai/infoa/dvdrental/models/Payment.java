package com.senai.infoa.dvdrental.models;
import java.time.*;

public class Payment {
    private int id;
    private int customerId;
    private int staffId;
    private int rentalId;
    private double amount;
    private LocalDate paymentDate;

    // TODO: adicionar atributos

    // Construtor sem parâmetros
    public Payment() {}
    // Construtor com parâmetros
    public Payment(int cusomerId, int staffId, int rentalId, double amount, LocalDate paymentDate) {
        this.customerId = cusomerId;
        this.staffId = staffId;
        this.rentalId = rentalId;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }
    // Getters e Setters
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int cusomerId) {
        this.customerId = cusomerId;
    }
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public int getRentalId() {
        return rentalId;
    }
    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public LocalDate getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
    
}

