package polymorphismHw.java;

public class subtractOLMain extends subtractOL{



    public static void main(String[] args) {

        subtractOL subObj = new subtractOL();
        System.out.println(subObj.subtract(2,3));

        System.out.println(subObj.subtract(100,40,10));
        System.out.println(subObj.subtract(300,100,100,50));

    }
}
