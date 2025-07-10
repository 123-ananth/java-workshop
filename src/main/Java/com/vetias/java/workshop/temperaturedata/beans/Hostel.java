package main.java.com.vetias.java.workshop.temperaturedata.beansdata.beans;

import java.time.LocalDateTime;

public class Hostel extends Building {
    public Hostel(String name, double area, int floors, LocalDateTime openingHours, LocalDateTime closingHours) {
        super(name, area, floors, openingHours, closingHours);
    
    }

    private int numberOfRooms;
    private boolean isMessOpen;

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isMessOpen() {
        return isMessOpen;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setMessOpen(boolean messOpen) {
        isMessOpen = messOpen;                                 
    }

    public void displayHostelInfo() {
        super.PrintDetails();
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Is Mess Open: " + (isMessOpen ? "Yes" : "No"));
    }
}