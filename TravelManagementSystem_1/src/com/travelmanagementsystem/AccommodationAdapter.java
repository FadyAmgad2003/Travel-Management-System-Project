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
    public class AccommodationAdapter implements Accommodation {
    private ExternalAccommodation externalAccommodation;

    public AccommodationAdapter(ExternalAccommodation externalAccommodation) {
        this.externalAccommodation = externalAccommodation;
    }

    @Override
    public double getPrice() {
        return externalAccommodation.getRate();
    }

    @Override
    public String getDescription() {
        return externalAccommodation.getInfo();
    }
}
