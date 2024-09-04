package javaDay5.java;

public class encapsulationDay5 {

    //USE GETTERS AND SETTERS TO ACHIEVE ENCAPSULATION


    static int noOfWheels = 4;
    static String registered = "yes";
    private String car;
    private String model;
    private int year;
    private int doors;
    private double miles;



    //GETTERS
    public String getCar() {
        return car;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getDoors() {
        return doors;
    }

    public double getMiles() {
        return miles;
    }


    //SETTERS
    public void setCar(String car) {
        this.car = car;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }


    //CONSTRUCTOR


    public encapsulationDay5() {
    }

    public encapsulationDay5(String car, String model, int year) {
        this.car = car;
        this.model = model;
        this.year = year;
    }
}
