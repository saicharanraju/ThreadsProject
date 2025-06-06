package com.scaler.threadspractice.Synchronization.AdderSubtractorUsingSynchronizedKeyword;

public class Subtractor implements Runnable{
    Count count;
    public Subtractor(Count count){
        this.count = count;
    }
    @Override
    public void run(){
        for(int i =0; i< 10000000; i++){
            synchronized (count) {
                count.val--;
            }
        }
    }
}
