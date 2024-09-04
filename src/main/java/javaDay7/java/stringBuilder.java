package javaDay7.java;

public class stringBuilder {
    //String Builder and String Buffer
    //

    //STRING BUILDER:
    //not thread safe
    //not suitable for multi threading envs
    //it is more efficient than buffer cause of thread safety condition
    //StringBuilder is not synchronized, which makes it faster than StringBuffer, but it is not thread-safe and should not be used in a multithreaded environment.

    //StringBuffer:
    // is synchronized, meaning its methods are thread-safe and can be safely used in a multithreaded environment.


    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" World");
        System.out.println(sb);

        String a = " Good Morning";
        sb.append(a);
        System.out.println(sb);


        StringBuffer sbfr = new StringBuffer();
        String b = "Good Night";
        sbfr.append(b);
        sbfr.append(" Evening");
        sbfr.replace(0,4,"Sleep");
        sbfr.replace(5,11," Time");
        System.out.println(sbfr);


    }
}