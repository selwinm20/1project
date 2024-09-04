package javaDay2.java;

import jdk.nashorn.api.tree.ForInLoopTree;

public class loopsDay2 {
    public static void main(String[] args) {

        //LOOPS
        //Java provides three types of Loops:
        // for,
        // while, and
        // do-while.

        // Four Elements control a loop: initialization expression(s), test expression, loop-body, and update expression.


        //Loop Type	Syntax
        //For loop	'For(initialization; condition; inc/dec){code}'
        //While loop	'While(condition){code}'
        //Do-While loop	'Do{code}while(condition);'



        //FOR LOOP

        //A for loop is a programming construct that runs a section of code repeatedly until a certain condition is met. For example, you can use a for loop to traverse a list or array to find a specific value, or to change the color of every pixel in an image.

        // for loop has two parts: a header and a body. The header defines the iteration and the body is the code that is executed once per iteration. The header often declares an explicit loop counter or loop variable. This allows the body to know

        for(int a = 1; a<11; a++){
            System.out.println(a);
        }

        for (int myLoop = 5; myLoop < 17; myLoop++) {
            System.out.println(myLoop+"THIS IS MY LOOP! THIS IS MY LOOP!"
            );
        }

        for (int myL = 2; myL <=6 ; myL++) {
            System.out.println(myL+ ":2<=6 2 is less than or equal 6");
        }

        for (int myfL=0; myfL <7; myfL++){
            System.out.println(myfL+": myfL++");
        }

        for (int myForLoop = 0; myForLoop <7; ++myForLoop) {
            System.out.println(myForLoop+ ": ++myForLoop");

        }



        //1-10 numbers
        //10-1 number

        for (int b=0;b<11;b++){
            System.out.println(b);
        }

        for (int i = 10; i >0 ; i--) {
            System.out.println(i);
        }

        for (int c = 1000; c >499 ; c=c-10) {
            System.out.println(c);
        }

        //NESTED FOR LOOP
        //code will run outer loop one time,
        // go on to the inner loop and run 3 times,
        // come back out to the outer loop and run one time,
        // then go back to the inner loop and run 3 times
        for (int x = 1; x <=2 ; x++) {
            System.out.println("this is the outer for loop: " +x);
            for (int y = 1; y <=3 ; y++) {
                System.out.println("this is the inner for loop: "+x);

            }

        }


//WHILE LOOPS
////While loop	'While(condition){code}'
        int e = 1;
        while (e<=10){
            System.out.println(e);
            e++;
        }

        System.out.println(" ");
        System.out.println(" ");



        //1000, 990,980....500

        int f = 1000;
        while(f>499){
            System.out.println(f);
            f=f-10;

        }

        System.out.println(" ");
        System.out.println(" ");

        //DO WHILE LOOPS
        //will always execute one time
        //'Do{code}while(condition);'

        int g=0;
        do {

            // Body of loop that will execute minimum
            // 1 time for sure no matter what
            System.out.println("Print statement");
            g++;
        }

        // Checking condition
        // Note: It is being checked after
        // minimum 1 iteration
        while (g < 0);


        System.out.println(" ");
        System.out.println(" ");


        //PRINT 1,2,3 TILL 50 WITH STRING PRINTED NEXT TO IT STATING IF ITS EVEN OR ODD


        for (int h = 1; h <= 50 ; h++) {
            if(h%2==0){
                System.out.println(h+" Even");
            }else{
                System.out.println(h+" Odd");
            }

        }


        System.out.println(" ");
        System.out.println(" ");


        //CHECK AND PRINT THE MULTIPLES OF 3 IN THE SERIES OF 1OO,999,998,997
        //divisible of 3
        int number = 1000;
        while(number>0){
            if(number%3==0){
                System.out.println(number);
            }
            number--;
        }








    }
}
