package main.java.com.vetias.java.workshop.temperaturedata.beansdata.beans;

public class Zone{
    private String name;
    private String zoneID;
    private String type;
    private double area;
    private String description;

    public String getName() {
        return name;
    }

    public String getZoneID() {
        return zoneID;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZoneID(String zoneID) {
        this.zoneID = zoneID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}