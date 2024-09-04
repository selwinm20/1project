package javaDay2.java;

public class tvObjectsMain {
    public static void main(String[] args) {

        tvObjects newObj = new tvObjects();
        newObj.model="sony";
        newObj.size=60.5;
        newObj.year=2024;
        newObj.specs="Smart Tv with Alexa";
        newObj.color="purple";
        System.out.println(newObj.model);


        tvObjects newObj2 = new tvObjects();
        newObj2.model="LG";
        newObj2.size=70.5;
        newObj2.year=2020;
        newObj2.specs="clap to turn on";
        newObj2.color="black";
        System.out.println(newObj2.model + " " + newObj2.size + " " + newObj2.year);

        tvObjects samsung = new tvObjects();
        samsung.model="samnsung";
        samsung.size=30.7;
        samsung.year=1995;
        samsung.specs="not a smart tv";
        samsung.color="gray";
        System.out.println(samsung.specs + " " + samsung.year + " " + samsung.model);

    }
}
