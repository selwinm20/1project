package javaday0.java;

public class Vars {

    public static void main(String[] args) {



    /*
    DATA TYPES
    PRIMITIVE:
    boolean     1BIT    TRUE OR FALSE
    byte        1BYTE   -128 TO 127
    short       2BYTES  -32,768 TO 32,767
    int         4BYTES  -2BILLION TO 2 BILLION
    long        8BYTES  -9QUINTILLION TO 9Q

    float       4BYTES  FRACTIONAL UPTO 6-7 DIGITS
    double      8BYTES  UP TO 15

    char        2BYTES  SINGLE CHARACTER

    REFERENCE:
    string      VARIES  A SEQUENCE OF CHARACTERS


    */



        String x = "pepsi";
        String y = "water";
        String temp;


        //assigning the value of x to temp
        temp = x;
        System.out.println(temp); //pepsi

        x=y;
        System.out.println(x); //water

        y=temp;
        System.out.println(y); //pepsi


    }
}