package javaDay8.java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//HASHSET, LINKEDHASHSET, TREESET

public class SetIntro {
    public static void main(String[] args) {

        //insertion order = basically typing line by line when typing in laptop

        //does not allow you to add duplicate values only list does
        //WE DONT KNOW WHY ITS IN ORDER WHEN YOU DO 1,2,3,4,5,
        //with randomized values it will print out randomly. that is the hash set
        //

        //HASHSET
        //A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
        Set <Integer> set1 = new HashSet<>();
        set1.add(50);
        set1.add(32);
        set1.add(26);
        set1.add(10);
        set1.add(30);
        //set1.add(32);
        System.out.println(set1);

        set1.remove(50);
        System.out.println(set1);

        set1.clear();
        System.out.println(set1);

        set1.add(100);
        System.out.println(set1);



        //LINKED HASHSET
        //MAINTAINS THE INSERTION ORDER

        //allows null values

        Set <Integer> set2 = new LinkedHashSet<>();
        set2.add(20);
        set2.add(1990);
        set2.add(12);
        set2.add(55);
        set2.add(null);
        System.out.println(set2);





        //TREE SET
        //does not allow null values
        //with integers it will list the numbers from least to greatest.
        Set<Integer> set3 = new TreeSet<>();
        set3.add(10);
        set3.add(-3);
        set3.add(-50);
        set3.add(55);
        System.out.println(set3);

        //with strings it will set them alphabetically
        Set<String> set4 = new TreeSet<>();
        set4.add("micky dz");
        set4.add("burger king");
        set4.add("pizza hut");
        set4.add("popeyes");
        System.out.println(set4);


        //Comparator

        //hashSet
        //can store null values
        //does not follow insertion order

        //LinkedHashSet
        //can store null values
        //follows insertion order

        //treeSet
        //can not store null values
        //follows sorting order

        //all items are unique = every data has a unique name in memory
        //set has all the values given a specific id of a hashcode in their memory
        //that's why we cannot have duplicates


    }
}
