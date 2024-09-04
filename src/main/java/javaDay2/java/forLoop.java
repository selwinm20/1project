package javaDay2.java;

public class forLoop {
    public static void main(String[] args) {

//Java For Loop

        //-----------FOR LOOP----------------

//When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:


//        This example will only print even values between 0 and 10:
        for (int i = 0; i <= 7; i= i+2) {
            System.out.println(i+": i=0;i<=10;i=i+2");
        }
        System.out.println(" ");

//        Increase by 3 starting at 3
        for (int myFL = 3; myFL < 10; myFL=myFL+3) {
            System.out.println(myFL+ ": 3,6,9 Stay real Fine ");
            System.out.println("Space");
        }

//        lets count by 5 each loop and stop at 20
        for (int myFl2 = 0; myFl2 <= 21; myFl2=myFl2+5) {
            System.out.println(  myFl2+": 5,10,15,20");
        }




        //--------------NESTED LOOPS----------

//        It is also possible to place a loop inside another loop. This is called a nested loop.

//        The "inner loop" will be executed one time for each iteration of the "outer loop":

    }
}
