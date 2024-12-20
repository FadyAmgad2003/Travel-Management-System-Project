/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelmanagementsystem;

/**
 *
 * @author Dell
 */
    
public class AccommodationBuilder {
    private double price;
    private String description;

    public AccommodationBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public AccommodationBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public Accommodation build() {
        return new Hotel(price, description);
    }
}
