package javaDay4.java;

public class gettersSettersMainDay4 {
    public static void main(String[] args) {

        gettersSettersDay4 gs = new gettersSettersDay4();
        System.out.println(gs.getPet());
        gs.setPet("dog");
        System.out.println(gs.getPet());

        System.out.println("#######################");


        gs.setPetName("Oso");
        gs.setBreed("Chiguahua");
        gs.setAge(7);
        gs.setWeight(20.5);
        gs.setFood("kibble");


        System.out.println(gs.getPet()+"\n"+gs.getBreed()+"\n"+gs.getAge()+"\n"+gs.getWeight()+"\n"+gs.getFood());



    }
}
