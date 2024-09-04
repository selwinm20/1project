package javaDay5.java;

public class staticMainDay5 {
    public static void main(String[] args) {

        //A static method in Java is a method that is part of a class rather than an instance of that class.
        //YOU CAN ALSO ACCESS A STATIC VARIABLE WITHOUT CREATING AN OBJECT OF THE CLASS

        //STATIC
        //COMMON TO ALL
        //ATTRIBUTES AND METHODS ARE ALWAYS PUBLIC
        //ATTRIBUTES AND METHODS ASSOCIATED WITH A CLASS ITSELF
        //ATTRIBUTES AND METHODS CAN ONLY BE ACCESSED BY THE CLASS REFERANCE

        //JUST CALL THE CLASS NAME AND THE STATIC VARIABLE
        System.out.println(staticDay5.noOfWheels);

        //IF YOU WANT TO CHANGE THE STATIC VARIABLE CALL THE CLASS NAME AND STATIC VARIABLE AND ASSIGN IT SOME VALUE HERE IN THE MAIN CLASS
        staticDay5.classRoom="Full Stack Dev";
        System.out.println(staticDay5.classRoom);


        //A WAY OF CREATING AN ARRAY
        //datatype[] arrayname{}
        //TYPE .LENGTH TO SEE THE SIZE OF THE ARRAY
        String [] names = {"Sel","Eli","Oso","Buddy"};
        System.out.println(names.length);
        System.out.println(names[0]);


        names[0] ="sammy";
        System.out.println(names[0]);
        System.out.println(names.length);
        System.out.println(names[0]);










    }
}
