package com.me;

//step 1
public class SampleThread extends Thread {

    //step 2
    @Override
    public void run(){

        //step 3
        System.out.println("Inside : " + Thread.currentThread().getName());

    }

}
