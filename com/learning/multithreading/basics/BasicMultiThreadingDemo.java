package com.learning.multithreading.basics;


class ThreadClassDemo extends Thread{
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "ThreadClassDemo Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

// Java code for thread creation by implementing
// the Runnable Interface
class RunnableClassDemo implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "RunnableClassDemo Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

public class BasicMultiThreadingDemo {

    public static void initThreadClassDemo(){
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            ThreadClassDemo object
                    = new ThreadClassDemo();
            object.start();
        }
    }

    public static void initRunnableClassDemo(){
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                    = new Thread(new RunnableClassDemo());
            object.start();
        }
    }

    public static void main(String[] args) {

        initThreadClassDemo();

        initRunnableClassDemo();
    }
}
