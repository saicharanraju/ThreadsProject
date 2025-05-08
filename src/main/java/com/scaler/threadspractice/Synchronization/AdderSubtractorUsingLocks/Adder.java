package com.scaler.threadspractice.Synchronization.AdderSubtractorUsingLocks;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Count count;
    Lock lock;
    public Adder(Count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run(){
        for(int i =0; i< 10000000; i++){
            lock.lock();
            count.val++;
            lock.unlock();
        }
    }
}
