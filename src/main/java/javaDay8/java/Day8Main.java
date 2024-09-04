package javaDay8.java;

public class Day8Main {
    public static void main(String[] args) {
        generics obj = new generics();
        obj.shout("hello", "its my birthday!");
        obj.shout(34, "man i am old");
        obj.shout(1990, "August 20th 1990");
        obj.shout(34.0, 35);


        //this is the generics syntax
        generics<String, String> obj1 = new generics<>("hi", "hi");
        generics<Integer, Double> obj2 = new generics<Integer, Double>(2,5.00);

        //int = Integer
        //double = Double
        //float = Float

        //WRAPPER CLASSES:
        //int is getting wrapped from a primitive datatype to a object now


    }
}
