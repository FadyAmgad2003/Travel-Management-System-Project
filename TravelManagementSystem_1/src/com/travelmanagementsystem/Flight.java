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
    
public class Flight {
    private String departure;
    private String arrival;
    private double price;

    public Flight(String departure, String arrival, double price) {
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public double getPrice() {
        return price;
    }
}
