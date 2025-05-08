package com.scaler.threadspractice.Synchronization.AdderSubtractorUsingSynchronizedMethods;

public class Adder implements Runnable{
    Count count;
    public Adder(Count count){
        this.count = count;
    }
    @Override
    public void run(){
        for(int i =0; i< 10000000; i++){
            count.increment();
        }
    }
}
