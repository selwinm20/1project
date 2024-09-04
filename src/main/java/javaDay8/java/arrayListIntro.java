package javaDay8.java;

import java.util.ArrayList;

public class arrayListIntro {

    public static void main(String[] args) {


        //Java ArrayList
        //The ArrayList class is a resizable array, which can be found in the java.util package.
        //The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:


        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

        //FUNCTIONS
        //when adding another element to an arraylist it will move the index over to make room for the new element
        cars.add("Honda");
        cars.add("Chevy");
        cars.add(0,"Ford");
        System.out.println(cars);
        System.out.println(cars.size());



    }
}
