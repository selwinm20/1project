package javaDay4.java;

public class pDay4 {
    public static void main(String[] args) {

        personDay4 pObject = new personDay4("sel",33);
        System.out.println(pObject.name+" "+pObject.age);

        System.out.println("--");


        pObject.snooze="snooze 3 times then wake up";
        pObject.sleeping();

        pObject.eating();


    }
}
