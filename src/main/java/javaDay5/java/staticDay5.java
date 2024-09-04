package javaDay5.java;

public class staticDay5 {

    //A static method in Java is a method that is part of a class rather than an instance of that class.

    //an instance of a class is a concrete object that's created from a class's blueprint, or definition. An instance has all the characteristics of the class, but with specific values. It's also known as a class object or class instance.

//COLOR, DOORS, NUMBER OF WHEELS

    static int noOfWheels =4;
    static String classRoom = "FSD";

    private String color;
    private int doors;

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    static void driving (){
        System.out.println("the car is driving");
    }

}
