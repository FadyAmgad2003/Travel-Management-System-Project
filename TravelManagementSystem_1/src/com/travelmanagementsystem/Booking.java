package com.travelmanagementsystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
   public class Booking { 
    private Accommodation accommodation;
    private int nights;

    public Booking(Accommodation accommodation, int nights) {
        this.accommodation = accommodation;
        this.nights = nights;
    }

    Booking(Flight flight, Accommodation accommodationObject, TravelPackage travelPackage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getBookingPrice() {
        return accommodation.getPrice() * nights;
    }

    public String getBookingDescription() {
        return accommodation.getDescription() + " for " + nights + " nights";
    }
}

