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
public class AccommodationFactory {
    public Accommodation createAccommodation(String type, double price, String description) {
        if (type.equals("Hotel")) {
            return new Hotel(price, description);
        } else if (type.equals("Hostel")) {
            return new Hostel(price, description);
        } else {
            return new Resort(price, description);
        }
    }

    Accommodation createAccommodation(String accommodation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}