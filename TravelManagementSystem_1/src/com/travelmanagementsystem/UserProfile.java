/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class UserProfile {
    private String username;
    private String password;
    private List<Booking> bookings;

    public UserProfile(String username, String password) {
        this.username = username;
        this.password = password;
        this.bookings = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}