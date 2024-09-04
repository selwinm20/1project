package javaDay3.java;

public class methodsDay3 {


    //A method is a block of code which only runs when it is called.
    //
    //You can pass data, known as parameters, into a method.
    //
    //Methods are used to perform certain actions, and they are also known as functions.
    //
    //Why use methods? To reuse code: define the code once, and use it many times.

    //IN A CLASS WE ARE JUST ASSIGNING VARIABLES WITHOUT GIVING THEM VALUES
    String model;
    double size;
    int year;
    String specs;
    String color;




    //WE CREATE A METHOD IN THIS CLASS OF "METHODSDAY3" CALLED "DISPLAYALLVARIABLES" AND SOUT ALL VARIABLES
    //ONCE THIS METHOD IS CALLED IN THE EXTENDING CLASS "METHODSMAINDAY3" BY AN OBJECT, THEN IT WILL DISPLAY ALL VARIABLES LIKE  LG.DISPLAYALLVARIABLES
    public void displayAllVariables(){
        System.out.println(model);
        System.out.println(size);
        System.out.println(year);
        System.out.println(specs);
        System.out.println(color);
    }

    //THIS IS A METHOD THAT ALL ITS DOING IS PRINTING THE STRING WHEN I CALL IT
    public void watching(){
        System.out.println("i am currently watching sweet tooth via Netflix on my brand new LG TV!");
    }

    //HERE WERE ARE USING INT INSTEAD OF VOID SO THAT THE USER MAY INPUT SOME VALUES IN THE PARAMETERS
    public int add(int a, int b){
        return a+b;
    }

    //WE CAN ADD MORE THAN 2 PARAMETERS
    public int sub(int c, int d, int e){
        return c-d-e;
    }


    int changeChanelNum;

    public void changeChanel(int newChanel){
        changeChanelNum=newChanel;
        System.out.println(changeChanelNum);

    }

    //CREATE A METHOD WHICH WILL CHANGE THE COLOR WITH THE PARAMETER

    public void changeColor(String newColor){
        color = newColor;
    }
}
