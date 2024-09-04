package javaDay7.java;

public class threadsDay7 {

    //Java Threads
    //Threads allows a program to operate more efficiently by doing multiple things at the same time.
    //Threads can be used to perform complicated tasks in the background without interrupting the main program.

    //CREATING A THREAD
    //**There are two ways to create a thread.**
    //
    //It can be created by extending the Thread class and overriding its run() method:
    //Another way to create a thread is to implement the Runnable interface:

    //RUNNING THREADS
    //If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:

    //If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method:


    //SYNCHRONIZED KEY WORD:
    //use the synchronized keyword  to prohibit another thread from entering the first thread

    //The synchronized keyword is a modifier that locks a method so that only one thread can use it at a time. This prevents problems that arise from race conditions between threads.

    //The synchronized keyword in Java is a way to ensure that only one thread can access a shared resource at a time. This is important because when multiple threads access and modify a shared resource simultaneously, it can lead to inconsistent data and unexpected results, a situation commonly known as a race condition

    //IN ORDER TO USE THE CLASSES WE NEED TO MAKE AN OBJECT OF THEM.
    public static void main(String[] args) {

        cooking c1 = new cooking();
        cleaning c2 = new cleaning();

        c1.start();
        c2.start();
    }

    //USE EXTENDS THREAD FOR THREAD CLASS
    public static class cooking extends Thread{
        public void run(){
            int i = 0;
            while(i<250){
                System.out.println("this is Cooking");
                i++;
            }
        }

    }

    public static class cleaning extends Thread{
        public void run(){
            int i = 0;
            while(i<150){
                System.out.println("this is Cleaning");
                i++;
            }
        }

    }




}
