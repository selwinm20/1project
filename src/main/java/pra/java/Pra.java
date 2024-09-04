package pra.java;

import java.util.Scanner;


public class Pra {

    public static void main(String[] args) {

        //scanner


        //making a scanner
        Scanner scannerObj = new Scanner(System.in);

        System.out.println("what is your name"); //asking the user what their name is
        String name = scannerObj.nextLine(); //assign your scanner to string var

        System.out.println("how old are you");

        System.out.println("hey "+name);

    }
}
