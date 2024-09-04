public class aNotes {


    //JDK = JAVA DEVELOPMENT KIT
    //JRE = JAVA RUN TIME ENVIRONMENT ->RUNS CODE AND JAVA LIBRARIES
    //JVM =JAVA VIRTUAL MACHINE

    //JAVAC = JAVA COMPILER ->COMPILES THE SOURCE CODE INTO MACHINE CODE
    //JIT JUST IN TIME -> INTERPRITER READS CODE LINE BY LINE


    //+++++++JAVA MEMORY+++++++//

//STACK MEMORY = LOCAL VARS, METHOD CALLING
//HEAP MEMORY = OBJECT, ARRAYS, THREADS, NEW, string pool

//STRING POOL = GET STORED IN HEAP MEMORY

    //STRING CLASS = STRINGS ARE FINAL = IMMUTABLE - ONCE CREATED ITS VALUES CANNOT BE CHANGED.

    //THESE TWO STRINGS WILL GET STORED IN THE SAME BLOCK INSIDE THE STRING POOL BECAUSE THE VALUE OF BOTH STRING A AND B ARE THE SAME
    String a = "hello world";
    String b = "hello world";



    //THIS STRING IS GOING TO BE STORED INSIDE THE HEAP MEMORY DIRECTLY BECAUSE OF THE NEW KEYWORD
    String e = new String();

   //THESE TWO STRINGS WILL HAVE TWO DIFFERENT MEMORY LOCATIONS IN THE STRING POOL BECAUSE OF THE CASES
    String c = "Hello Mars";
    String d = "heLLo Mars";



    //+++++++++++++++++FINAL++++++++++++++++//

    //FINAL:
    //classes/methods/variables that cannot change.
    //they cannot be inherited.
    //USED TO PUT RESTRICTIONS ON CLASSES, METHODS, AND VARIABLES
    //YOU CANT EXTEND FROM A FINAL CLASS

    //FINALIZE:
    //a method that runs before an object is removed from the garbage collector
    //for clean up and removing files

    //STRING BUILDER:

    //GARBAGE COLLECTOR
    //it comes unannounced and take the data tha tis not being used
    //we can not force it


    //COLLECTIONS FRAMEWORK:
    //ARRAYS: were fixed in size

    //LIST      = ArrayList, LinkedList, Stack
    //SET       = HashSet, LinkedHasSet
    //SORTEDSET = TreeSet


    //QUEUE     = Queue, Priority Queue, DoubleEndQue
    //MAP       = HashMap, LinkedHashMap, TreeMap


    //LIST = allows duplicates, list follows the insertion order

    //SET = set does not allow duplicates, set does not follow the insertion order




}
