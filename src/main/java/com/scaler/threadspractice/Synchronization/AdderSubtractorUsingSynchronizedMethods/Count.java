package com.scaler.threadspractice.Synchronization.AdderSubtractorUsingSynchronizedMethods;

public class Count {
    int val = 0;

    synchronized public void increment(){
        val++;
    }
    synchronized public void decrement(){
        val--;
    }
    public int getVal(){
        return val;
    }
}
