package polymorphismHw.java;

public class catGrandChild extends dogChild{

    @Override
    public void sound() {
        System.out.println("MEOW MEOW");
    }

    public static void main(String[] args) {
        catGrandChild cgs = new catGrandChild();
       cgs.sound();
    }

}
