package javaDay6.java;

public class stringsDay6 {
    public static void main(String[] args) {

        //IMMUTABLE: CANT BE CHANGED

        //STRING POOL = GET STORED IN HEAP MEMORY

        //STRING CLASS = STRINGS ARE FINAL = IMMUTABLE - ONCE CREATED ITS VALUES CANNOT BE CHANGED.

        //THESE TWO STRINGS WILL GET STORED IN THE SAME BLOCK INSIDE THE STRING POOL BECAUSE THE VALUE OF BOTH STRING A AND B ARE THE SAME
        String a = "hello world";
        String b = "hello world";
        System.out.println(a==b);



        //THIS STRING IS GOING TO BE STORED INSIDE THE HEAP MEMORY DIRECTLY BECAUSE OF THE NEW KEYWORD
        String e = new String();

        //THESE TWO STRINGS WILL HAVE TWO DIFFERENT MEMORY LOCATIONS IN THE STRING POOL BECAUSE OF THE CASES
        String c = "Hello Mars";
        String d = "heLLo Mars";
        System.out.println(c==d);

        System.out.println(d.length());
        System.out.println(d.charAt(0));
        System.out.println(d.indexOf('M'));
        System.out.println(d.substring(3));
        System.out.println(d.substring(4,8));

        int f = d.length();
        System.out.println(f);







    }
}
