package com.scaler.threadspractice.Synchronization.AdderSubtractor;

public class Adder implements Runnable{
    Count count;
    public Adder(Count count){
        this.count = count;
    }
    @Override
    public void run(){
        for(int i =0; i< 10000000; i++){
            count.val++;
        }
    }
}
