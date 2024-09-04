package javaDay5.java;

public class encapsulationMainDay5 {
    public static void main(String[] args) {


        //TO MAKE SURE THAT SENSITIVE DATA IS HIDDEN FROM THE USER
        //HO TO WE ACHIEVE THIS?
        // 1. DECLARE CLASS VARIABLES/ATTRIBUTES AS PRIVATE
        // 2. WE WILL CREATE A SET OR GET METHODS TO ACCESS OR UPDATE THE VALUES OF PRIVATE VARIABLES/ATTRIBUTES, ACCESS MODS , GETTER, SETTER.

        //MAKE some VARIABLES
        //CONSTRUCTOR
        //GIVE METHODS
        //CREATE GETTERS SETTERS
        //ALSO OBJECTS

        encapsulationDay5 carObject = new encapsulationDay5();
        carObject.setCar("Honda");
        carObject.setModel("Accord");
        carObject.setYear(2003);
        carObject.setMiles(300);
        carObject.setDoors(2);


        encapsulationDay5 carObject2 = new encapsulationDay5("honda","civic",2024);
        System.out.println(carObject2.getCar()+"\n"+carObject2.getModel()+"\n"+carObject2.getYear());

        System.out.println(encapsulationDay5.noOfWheels);
        encapsulationDay5.noOfWheels=6;

    }



}