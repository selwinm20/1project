package javaDay5.java;

//To inherit in Java means allowing all methods and variables from one class to be accessible by another class. That is, the new class inherits these items. The parent class, also called superclass, is the class whose methods and variables can be used in the child class (also called subclass)

//subclass (child) - the class that inherits from another class
//superclass (parent) - the class being inherited from
//To inherit from a class, use the extends keyword.

//THIS IS YOUR CHILD CLASS FOR INHERITANCE
//CHILD CLASS OR SUBCLASS

import javafx.scene.Parent;

public class inheritanceChildMainDay5 extends inheritanceParentDay5 {

    //super key word is used to pull other keywords from the parent class
//cant make a method inside of a method

    //make an object of a child class if youre going to over ride something.

    @Override
    public void out() {
        super.out();
    }


    public static void main(String[] args) {
        inheritanceChildMainDay5.greet();

        inheritanceChildMainDay5 c1 = new inheritanceChildMainDay5();
        c1.out();

        inheritanceParentDay5.beach1();



    }





}