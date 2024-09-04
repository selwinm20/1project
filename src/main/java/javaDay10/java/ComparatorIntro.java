package javaDay10.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Comparable interface can be used to provide single way of sorting whereas Comparator interface is used to provide different ways of sorting. For using Comparable, Class needs to implement it whereas for using Comparator we don't need to make any change in the class.

public class ComparatorIntro {


    public static void main(String[] args) {


        List<Student> s = new ArrayList<>();
        s.add(new Student(112,"oso"));
        s.add(new Student(35,"buddy"));
        s.add(new Student(151,"eli"));
        s.add(new Student(200,"turtle"));

        Collections.sort(s, new IdComparator());
        System.out.println(s);

        for (Student ss : s){
            System.out.println(ss.getId()+ss.getName());

        }


    }



}
