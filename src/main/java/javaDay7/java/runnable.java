package javaDay7.java;


//Another way to create a thread is to implement the Runnable interface:
//If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method:

class threadRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("1st thread");

    }
}

class threadRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("1nd thread");

    }
}


public class runnable {
    public static void main(String[] args) {

        threadRunnable1 tr1 = new threadRunnable1();
        Thread threadObj = new Thread(tr1);

        threadRunnable2 tr2 = new threadRunnable2();
        Thread threadObj2 = new Thread(tr2);

        threadObj.start();
        threadObj2.start();

    }
}
