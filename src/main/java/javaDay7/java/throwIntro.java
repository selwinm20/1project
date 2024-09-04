package javaDay7.java;

public class throwIntro {

    //CUSTOM EXCEPTION CLASS
    public static class NNE extends Exception{
        //CONSTRUCTOR
        public NNE (String messsage){
            super(messsage);
        }
    }

    //CREATING A METHOD TO CHECK IF NUMBER IS POS OR NEG
    public static void checkNumber(int number) throws NNE{
        if(number<0){
            throw new NNE("Number must be positive");
        }else{
            System.out.println("Number must be positive");
        }
    }

    public static void main(String[] args) {
        try{
            checkNumber(-3);
        }catch (NNE e){
            System.out.println("cause an exception: " + e.getMessage());
        }
    }


}
