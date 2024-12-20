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
 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TravelManagementSystem {
    private JFrame frame;
    private JTextField typeField;
    private JTextField priceField;
    private JTextField descriptionField;
    private JTextField nightsField;

    public TravelManagementSystem() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Travel Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel typeLabel = new JLabel("Accommodation Type:");
        typeField = new JTextField(10);
        frame.add(typeLabel);
        frame.add(typeField);

        JLabel priceLabel = new JLabel("Price:");
        priceField = new JTextField(10);
        frame.add(priceLabel);
        frame.add(priceField);

        JLabel descriptionLabel = new JLabel("Description:");
        descriptionField = new JTextField(10);
        frame.add(descriptionLabel);
        frame.add(descriptionField);

        JLabel nightsLabel = new JLabel("Nights:");
        nightsField = new JTextField(10);
        frame.add(nightsLabel);
        frame.add(nightsField);

        JButton bookButton = new JButton("Book");
        bookButton.addActionListener(new BookButtonListener());
        frame.add(bookButton);

        frame.pack();
        frame.setVisible(true);
    }

    private class BookButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String type = typeField.getText();
            double price = Double.parseDouble(priceField.getText());
            String description = descriptionField.getText();
            int nights = Integer.parseInt(nightsField.getText());

            Accommodation accommodation = new AccommodationFactory().createAccommodation(type, price, description);
            Booking booking = new Booking(accommodation, nights);

            JOptionPane.showMessageDialog(frame, "Booking Price: " + booking.getBookingPrice() + "\nBooking Description: " + booking.getBookingDescription());
        }
    }

    public static void main(String[] args) {
        new TravelManagementSystem();
    }
}