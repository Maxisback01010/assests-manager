package com.pluralsight.Vehicle;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;
   //constuctor
    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {

        super(description, dateAcquired, originalCost);

        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
}
