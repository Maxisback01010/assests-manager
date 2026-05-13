package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    // constructor
    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {

        super(description, dateAcquired, originalCost);

        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    // getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    // override getValue
    @Override
    public double getValue() {

        double valuePerFoot = 0;

        if (condition == 1) {
            valuePerFoot = 180;
        } else if (condition == 2) {
            valuePerFoot = 130;
        } else if (condition == 3) {
            valuePerFoot = 90;
        } else if (condition == 4) {
            valuePerFoot = 80;
        }

        return (squareFoot * valuePerFoot) + (lotSize * 0.25);
    }
}

