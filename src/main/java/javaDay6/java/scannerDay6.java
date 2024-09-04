package javaDay6.java;

import java.util.Scanner;

public class scannerDay6 {
    public static void main(String[] args) {
        //Java User Input
        //The Scanner class is used to get user input, and it is found in the java.util package.

        //To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:

        Scanner userInput = new Scanner(System.in); //creat scanne robject
        System.out.println("Enter username");
        System.out.println("Enter password");

        String userName = userInput.nextLine();//read user input
        System.out.println("Username is: " + userName); //output user input

        String pw = userInput.nextLine();
        System.out.println("password is: " +pw);


//        Method	Description
//        nextBoolean()	Reads a boolean value from the user
//        nextByte()	Reads a byte value from the user
//        nextDouble()	Reads a double value from the user
//        nextFloat()	Reads a float value from the user
//        nextInt()	    Reads a int value from the user
//        nextLine()	Reads a String value from the user
//        nextLong()	Reads a long value from the user
//        nextShort()	Reads a short value from the user



        scannerStudentDay6 ss = new scannerStudentDay6();
        System.out.println("Enter your id: ");
        userInput.nextInt();
        userInput.nextLine();




    }






}
