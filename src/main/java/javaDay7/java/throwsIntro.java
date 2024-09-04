package javaDay7.java;

public class throwsIntro {

    //THROWS:
    //The throws keyword indicates what exception type may be thrown by a method.
    //throws is a keyword in Java that is used in the signature of a method to indicate that this method might throw one of the listed type exceptions. The caller to these methods has to handle the exception using a try-catch block.

    //throws is a keyword in Java that is used in the signature of a method to indicate that this method might throw one of the listed type exceptions. The caller to these methods has to handle the exception using a try-catch block.

    //Differences between throw and throws:
    //throw	                                                 throws
    //Used to throw an exception for a method	    Used to indicate what exception type may be thrown by a method
    //Cannot throw multiple exceptions               Can declare multiple exceptions

    //SYNTAX:
    //throw is followed by an object (new type)
    //used inside the method

    //Syntax:
    //throws is followed by a class
    //and used with the method signature

    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        try{
            int c = divide(10,0);
            System.out.println(c);
        }catch (Exception e){
            System.out.println("cant with zero");
        }

    }
}
