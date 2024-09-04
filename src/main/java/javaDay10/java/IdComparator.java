package javaDay10.java;

import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.Comparator;

//comparator can compare multiple ways/objects

//Comparator vs. Comparable
//A comparator is an object with one method that is used to compare two different objects.
//
//A comparable is an object which can compare itself with other objects.
//
//It is easier to use the Comparable interface when possible, but the Comparator interface is more powerful because it allows you to sort any kind of object even if you cannot change its code.

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }




}
