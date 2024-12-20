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
public class AccommodationPrototype implements Cloneable {
    private double price;
    private String description;

    public AccommodationPrototype(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new AccommodationPrototype(price, description);
    }
}