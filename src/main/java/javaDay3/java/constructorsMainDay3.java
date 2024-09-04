package javaDay3.java;

public class constructorsMainDay3 {
    public static void main(String[] args) {

        //THIS IS THE OBJECT WE ARE MAKING TO USE THE CONSTRUCTOR WITH THE PARAMETERS.
        //TYPE THE VALUES IN THE PARAM AFTER MAKING THE OBJ
        //TO PRINT USE THE OBJECT NAME. TO CALL THE VALUES
        constructorsDay3 newObj = new constructorsDay3("Sony",34.88);
        System.out.println(newObj.model + " " + newObj.size);

        System.out.println("---");

        constructorsDay3 yC = new constructorsDay3(2024,"lavender");
        System.out.println(yC.year);
        System.out.println(yC.color);


    }
}
