package com.senai.infoa.dvdrental.models;
import java.time.LocalDateTime;

public class Actor {
    private String id;
    private String firstName;
    private String lastName;
    private LocalDateTime lastUpdate;

    public Actor(){}
    public Actor(String firstName, String lastName, LocalDateTime lastUpdate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

}

