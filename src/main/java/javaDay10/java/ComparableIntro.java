package javaDay10.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableIntro {

    //COMPARATOR VS COMPARABLE

    //COMPARABLE:
    //is an interface java.lang
    //used to compare current object with another object
    //single sorting
    //compareTo();

    //COMPARATOR
    //interface java.util
    //used to compare two or more objects
    //multiple sorting
    //compare()

    public static void main(String[] args) {

        List<Student> s = new ArrayList<>();
        s.add(new Student(12,"oso"));
        s.add(new Student(5,"buddy"));
        s.add(new Student(11,"eli"));
        s.add(new Student(20,"turtle"));

//        Collections.sort(s);
        System.out.println(s);


    }

}
