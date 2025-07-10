package main.java.com.vetias.java.workshop.temperaturedata.beansdata.beans;

import java.time.LocalDateTime;

public class AcedemicBuilding extends Building{
    public AcedemicBuilding(String name, double area, int floors, LocalDateTime openingHours,
            LocalDateTime closingHours) {
        super(name, area, floors, openingHours, closingHours);
    }
    private boolean hasLibraryOpen;
    private boolean isAuditoriumOpen;
    
    public boolean hasLibraryOpen() {
        return hasLibraryOpen;
    }
    public boolean isAuditoriumOpen() {
        return isAuditoriumOpen;
    }
    public void setHasLibraryOpen(boolean hasLibraryOpen) {
        this.hasLibraryOpen = hasLibraryOpen;
    }
    public void setIsAuditoriumOpen(boolean isAuditoriumOpen) {
        this.isAuditoriumOpen = isAuditoriumOpen;
    }
    public void displayAcademicBuildingInfo() {
        super.PrintDetails();
        System.out.println("Has Library: " + (hasLibraryOpen ? "Yes" : "No"));
        System.out.println("Is Auditorium Open: " + (isAuditoriumOpen ? "Yes" : "No"));
    }
}