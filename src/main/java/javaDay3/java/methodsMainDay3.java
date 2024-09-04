package javaDay3.java;

public class methodsMainDay3 {
    public static void main(String[] args) {

        //IN ORDER TO CALL THE METHOD FROM "METHODSDAY3" WE NEED TO MAKE AN OBJECT
        //ASSIGN VALUES NOW TO YOUR NEW OBJECT WHICH IS LG
        //AFTER ASSIGNING YOU CAN CALL THE METHOS "DISPLAYALLVARIABLES" BY USING LG.DISPLAYALLVARIABLES
        methodsDay3 lg = new methodsDay3();
        lg.model="LG";
        lg.size=70.5;
        lg.year=2000;
        lg.specs="smart tv";
        lg.color="black";

        lg.displayAllVariables();
        System.out.println(lg.model);

        System.out.println(" ");

        //calling the watching method in "methodday3"
        lg.watching();


        System.out.println(" ");

        //IM GOING TO MAKE AN OBJECT HERE TO MANIPULATE THE INT ADD METHOD  IN "METHODSDAY3"
        methodsDay3 add = new methodsDay3();
        System.out.println(add.add(5,20));

        System.out.println(" ");

        //MAKING A NEW SUB OBJECT THEN CALLING THE SUB METHOD IN "METHODSDAY3" THEN ASSIGNING IT THE PARAMETER VALUES
        methodsDay3 sub = new methodsDay3();
        System.out.println(sub.sub(100,40,10));

        System.out.println(" ");

        lg.changeChanel(67);

        System.out.println(" ");

        lg.changeColor("green");
        System.out.println(lg.color);




    }



}
