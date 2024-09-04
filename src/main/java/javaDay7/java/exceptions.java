package javaDay7.java;

public class exceptions {

    //JAVA EXCEPTIONS
    //When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.
    //When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).

    //Java exceptions
    //From sources across the web
    //ArithmeticException
    //ArrayIndexOutOfBoundsException
    //ClassCastException
    //ClassNotFoundException
    //IllegalArgumentException
    //IllegalStateException
    //NoSuchMethodException
    //NullPointerException
    //InterruptedException
    //IOException
    //Throw Exceptions With Descriptive Messages


//TRY CATCH:
    //The try statement allows you to define a block of code to be tested for errors while it is being executed.

    //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

    //The try and catch keywords come in pairs: can only have one try and multiple catch


    //FINALLY:
    //The finally statement lets you execute code, after try...catch, regardless of the result:


    //SYNTAX
    //try {
    //  //  Block of code to try
    //}
    //catch(Exception e) {
    //  //  Block of code to handle errors
    //} finally{}


    //THROW KEYWORD
    //The throw statement allows you to create a custom error.
    //The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:

    //THROWS KEYWORD


    public static void main(String[] args) {


        int a =10;
        int b =0;
//        int result = a/b;
        //System.out.println(result);
        //THIS WILL BE THE EXCEPTION
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at javaDay7.java.exceptions.main(exceptions.java:44)


        //NOW LETS DO IT WITH THE TRY CATCH BLOCK
        try {
            int c=25;
            int d=0;
            int result1=c/d;
            System.out.println(result1);
        } catch (ArithmeticException divZero){
            System.out.println(" :Unable to divide by 0(zero)");
        }
        System.out.println("this is the result");


        //EXAMPLE WITH ARRAY
        String[] names = {"oso","Buddy"};
        System.out.println(names[0]);
        //System.out.println(names[2]); //ArrayIndexOutOfBoundsException

        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
        //	at javaDay7.java.exceptions.main(exceptions.java:68)

        try {
            System.out.println(names[3]);
            System.out.println("this is not going to work");
        }catch (ArrayIndexOutOfBoundsException noIndex){
            System.out.println("ArrayIndexOutOfBoundsException: no such index 3. choose between 0 and 1 for Oso or Buddy");
        }

        System.out.println(" ");

        try {
           String uc1 = names[0].toUpperCase();
            System.out.println(uc1);
        }catch (ArrayIndexOutOfBoundsException uc){
            System.out.println("unable to change index to upper case");
        }

        System.out.println(" ");


        //FINALLY
        //The finally statement lets you execute code, after try...catch, regardless of the result:
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong: no such index 10");
        } finally {
            System.out.println("The 'try catch' is finished and The finally statement lets you execute code, after try...catch, regardless of the result:");
        }

        System.out.println(" ");












    }

}
