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
  public class LuxuryPackage {
    private Accommodation accommodation;

    public LuxuryPackage(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    LuxuryPackage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getPackagePrice() {
        return accommodation.getPrice() * 2;
    }

    public String getPackageDescription() {
        return accommodation.getDescription() + " Luxury Package";
    }
}