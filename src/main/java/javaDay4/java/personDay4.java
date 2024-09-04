package javaDay4.java;

public class personDay4 {

    String name;
    int age;
    double height;
    int phoneNumber;

    String snooze;

    //variables = private
    private String nameP;

    //constructors

    public personDay4(String name, int age){
        this.name=name;
        this.age=age;
    }

    public personDay4(double height, int phoneNumber) {
        this.height = height;
        this.phoneNumber = phoneNumber;
    }

    //methods = eating,sleeping

    public void eating(){
        System.out.println("eating method");
    }

    public void sleeping(){
        System.out.println("i am sleeping method");
        System.out.println(snooze);
    }

}
