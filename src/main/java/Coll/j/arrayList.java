package Coll.j;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class arrayList {
    public static void main(String[] args) {


        /*The Collection in Java is a framework to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

What is Collection in Java
A Collection represents a single unit of objects, i.e., a group.*/



//        List, Set and Queue are immediate sub interfaces of Collection interface.

//        Map interface is also part of Java collection framework but it does not inherit the Collection interface.



        //-------------ARRAY LIST------------

//        The ArrayList class extends AbstractList and implements the List interface.
//        It uses dynamic arrays for storing elements.
//        It maintains insertion order.
//        ArrayList can contain duplicate elements.
//        It is not synchronized.

        //Note:
//ArrayList provides the facility of random access because it is index-based.
//A lot of shifting needs to occur if any element is removed from the array list. Thus, manipulation is slow in the Java ArrayList class.


        //----------Linked list----------------


//        LinkedList in java
//The LinkedList class extends AbstractSequentialList and implements the List and Deque interface.
// It uses a linked list data structure to store elements.
// It can contain duplicate elements.
// It is not synchronized.

//Note:
//It does not provide a random access facility.
//No shifting needs to occur in the Java LinkedList class, thus manipulation is fast.
//Doubly Linked List:
//Elements can be added or removed elements from both sides in a doubly-linked list.


        //--------HASH SET----------

//        HashSet in java
//        HashSet:
//        HashSet extends AbstractSet and implements the Set interface.
//        It does not maintain any order for its elements.
//        It uses a hash table for storage.

//        The elements are stored by the HashSet class using the hashing mechanism.
//        Only unique elements are allowed by the HashSet class.
//        Null values are allowed by the HashSet class.
//        It is non-synchronized.
//        The elements of the HashSet class are inserted based on their hashcode, thus this class does not maintain the insertion order.
//        It performs the best in search operations.
//        Its initial default capacity is 16.
//        Its load factor is 0.75.

        //Hierarchy of HashSet class:
//        The AbstractSet class is extended by the HashSet class that implements the Set interface. The Collection and Iterable interfaces are inherited by the Set interface in hierarchical order.


        //-----------LINKED HAS SET--------------

//        LinkedHashSet extends HashSet and implements the Set interface. It maintains insertion order for its elements. There are certain important points about the  LinkedHashSet class which is required to understand while using the LinkedHashSet class.

//        Similar to the HashSet class, the LinkedHashSet class can also hold the unique elements only.
//        It facilitates all optional set operations.
//        It is non-synchronized.
//        It allows null elements.
//        The insertion order is maintained by the LinkedHashSet class.

//        Hierarchy of LinkedHashSet class:
//        The HashSet class is extended by the LinkedHashSet class which implements the Set interface. The Collection and Iterable interfaces are inherited by the Set interface in hierarchical order.

        //-----------------TREE SET-------------

//        TreeSet extends AbstractSet and implements the NavigableSet interface. It maintains ascending order for its elements i.e. elements will be in sorted form.

//        Just like HashSet, the Java TreeSet class contains unique elements only.
//        The access and retrieval times of the TreeSet class are very fast.
//        It does not give access to the null element.
//                It maintains the ascending order.
//        It is non-synchronized.

//        Hierarchy of the TreeSet class:
//        The NavigableSet interface is implemented by the Java TreeSet class which extends SortedSet, Set, Collection, and Iterable interfaces in hierarchical order.



        List <String> NFL = new ArrayList<>();
        NFL.add("Washing Commanders");
        NFL.add("Washington Redskins");
        NFL.add("Baltimore Ravens");
        NFL.add("Philadelphia Eagles");
        NFL.add("Dallas Cowboys");
        System.out.println(NFL);

        List<Integer> myInt = new ArrayList<>();
        myInt.add(1);
        myInt.add(55);
        myInt.add(23);
        System.out.println(myInt);

//        Set<String> mySet = new Set<String>();









    }
}
