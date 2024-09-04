package javaDay3.java;


//A constructor in Java Programming is a block of code that initializes (constructs) the state and value during object creation. It is called every time an object with the help of a new () keyword is created. Even if you haven't specified any constructor in the code, the Java compiler calls a default constructor.

//A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

public class constructorsDay3 {

    String model;
    double size;
    int year;
    String specs;
    String color;


    //DEFAULT CONSTRUCTOR WHEN THERE IS NOTHING IN THE CIRCLE OR CURLY BRACKETS (constructor must be the class name)
    public constructorsDay3(){}

    //PARAMETER CONSTRUCTOR
    //RIGHT CLICK, GENERATE, CONSTRUCTOR
    //SHIFT AND PICK THE VARIABLES YOU WANT FOR PARAMETERS
    public constructorsDay3(String model, double size) {
        this.model = model;
        this.size = size;
    }


    public constructorsDay3(int year, String color){
        this.year=year;
        this.color=color;
    }
}
