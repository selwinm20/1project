package javaDay6.java;

//INTERFACE METHODS DO NOT HAVE BODIES IN THEM {}
//CANNOT CREATE OBJECTS USING INTERFACE

//Interfaces
//Another way to achieve abstraction in Java, is with interfaces.
//An interface is a completely "abstract class" that is used to group related methods with empty bodies:

//USE THE KEYWORD IMPLEMENTS INSTEAD OF EXTENDS TO INHERIT.
//To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:

public interface I {


    public void enrollStudent();
    public void deleteStudent();
    public void enrollCourse();


    public void animalSound(String sound); // interface method (does not have a body)
    public void run(int a); // interface method (does not have a body)

}
