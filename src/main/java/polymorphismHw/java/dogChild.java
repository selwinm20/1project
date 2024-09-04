package polymorphismHw.java;

public class dogChild extends animalParent{


    //we need to remove the super.sound and add our own sout to it to over ride
//    @Override
//    public void sound() {
//        super.sound();
//
//    }


    @Override
    public void sound() {
        System.out.println("BOW WOW");
    }

    public static void main(String[] args) {

        dogChild dc = new dogChild();
        dc.sound();
    }
}
