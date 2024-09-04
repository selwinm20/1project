package javaDay4.java;

public class arraysDay4 {
    public static void main(String[] args) {


//Java Arrays
//Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
//To declare an array, define the variable type with square brackets:

        //MAKE A STRING ARRAY OF NAMES
        //ARRAY NAME SHOULD BE NAME
        //LEANGTH IS 10

        String[] names = new String[10];
        names[0] = "Sel";
        names[1]="ivan";
        names[2]="maz";
        names[3]="oso";
        names[4]="buddy";
        names[5]="lady";
        names[6]="eli";
        names[7]="monster";
        names[8]="elf";
        names[9]="ancient";
        System.out.println(names[7]);






        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(numbers[0]);

        //CHANGE AN ARRAY ELEMENT
        numbers[0]=3;
        System.out.println(numbers[0]);

    }
}
