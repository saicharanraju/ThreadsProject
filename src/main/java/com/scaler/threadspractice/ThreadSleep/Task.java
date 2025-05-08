package com.scaler.threadspractice.ThreadSleep;

public class Task implements Runnable {
    @Override
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName() + " sending query to DB...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " query sent to DB");
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
