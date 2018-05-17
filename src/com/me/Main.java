package com.me;

public class Main {

    public static void main(String[] args) {

        //step 4
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Thread....");

        //step 5 instance
        Thread thread = new SampleThread();

        //step 6 method with new object
        System.out.println("Starting Thread......");
        thread.start();

        Thread thread1 = new SampleThread();
        thread1.start();

        System.out.println("Creating Runnable...");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside : " + Thread.currentThread().getName());
            }
        };

        System.out.println("Starting thread...");
        //thread.start();

        System.out.println("Create Runnable Thread...");

        Thread thread2 = new Thread(runnable);

        System.out.println("Start Runnable Thread...");
        thread2.start();
        //LambdaRunnable();

    }

    private static void LambdaRunnable (){

        System.out.println("Creating Runnable using lambda expressions.....");
        Runnable runnable = () -> {
            System.out.println("Inside LambdaRunnable(): " + Thread.currentThread().getName());
        };

        System.out.println("Creating Thread LamdbaRunnable()...");
        //Thread thread = new Thread(runnable);

        System.out.println("Starting Thread LambdaRunnable()...");
        //thread.start();

    }


}
