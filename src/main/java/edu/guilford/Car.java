package edu.guilford;

public class Car {

     // Attributes
     private String make;
     private String model;
     private int year;
     private String color;
     

    // Create a constructor with user input values
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }


    // getters and setters

    public Car(String string) {
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getColor() {
        return this.color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    // toString method

    @Override

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }


}



 
    


