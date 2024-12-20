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
    public class ExternalAccommodation {
    private double rate;
    private String info;

    public ExternalAccommodation(double rate, String info) {
        this.rate = rate;
        this.info = info;
    }

    public double getRate() {
        return rate;
    }

    public String getInfo() {
        return info;
    }
}

