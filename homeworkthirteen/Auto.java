package com.proftelran.org.homeworkthirteen;

public class Auto {

    String autonumber;
    String color;
    String model;
    double mileage;
    double price;

    public String getAutonumber() {
        return autonumber;
    }

    public void setAutonumber(String autonumber) {
        this.autonumber = autonumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Auto(String autonumber, String color, String model, double mileage, double price) {
        this.autonumber = autonumber;
        this.color = color;
        this.model = model;
        this.mileage = mileage;
        this.price = price;

    }
}
