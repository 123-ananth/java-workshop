package main.java.com.vetias.java.workshop.temperaturedata.beansdata.beans;

public class Temperaturesensor implements Sensor {
    private float temperature;
    public Temperaturesensor(float atemperature){
        temperature=atemperature;
    }
    @Override
    public float getReading(){
        return temperature;
    }

}
