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
   public class CulturalPackage {
    private Accommodation accommodation;

    public CulturalPackage(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    public double getPackagePrice() {
        return accommodation.getPrice() * 4;
    }

    public String getPackageDescription() {
        return accommodation.getDescription() + " Cultural Package";
    }
}
