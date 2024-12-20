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
   public class AdventurePackage {
    private Accommodation accommodation;

    public AdventurePackage(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    public double getPackagePrice() {
        return accommodation.getPrice() * 3;
    }

    public String getPackageDescription() {
        return accommodation.getDescription() + " Adventure Package";
    }
}
