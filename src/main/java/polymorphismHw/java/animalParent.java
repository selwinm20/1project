package polymorphismHw.java;

//OVERRIDING
//CLASS ANIMAL -> PARENT -> METHOD SOUND (ANYTHING)
//  |
//CLASS DOG -> CHILD -> METHOD SOUND (BOW WOW)
//  |
//CLASS CAT -> GRAND CHILD -> METHOD SOUND (MEOW MEOW)

public class animalParent {

    public void sound(){
        System.out.println("Bark bark");
    }

    public void bird(){
        String chirp="chirp";
        String fly = "fly fly";
        System.out.println(chirp +fly);


    }

}
