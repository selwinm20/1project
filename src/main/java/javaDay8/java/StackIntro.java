package javaDay8.java;

import java.util.Stack;

public class StackIntro {

    public static void main(String[] args) {


        // Stack data structure. The class is based on the basic principle of last-in-first-out. In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek. The Stack class extends Vector and provides additional functionality specifically for stack operations, such as push, pop, peek, empty, and search. The Stack class can indeed be referred to as a subclass of Vector, inheriting its methods and properties.

        //STACK
        //LIFO = LAST IN FIRST OUT

        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Cat");
        animals.push("birds");
        animals.push("turtles");

        System.out.println(animals);
        System.out.println(animals.peek()); // peek allows  you to view at the last element
        animals.pop(); // pop allows for the deletion of the last element
        System.out.println(animals);



    }
}
