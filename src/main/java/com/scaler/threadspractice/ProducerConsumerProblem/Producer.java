package com.scaler.threadspractice.ProducerConsumerProblem;

import java.util.Queue;

public class Producer implements Runnable {
    Queue<Object> queue;
    int maxSize;
    public Producer(Queue queue, int size){
        this.queue = queue;
        this.maxSize = size;
    }
    @Override
    public void run(){

        while(true){
            synchronized (queue) {
                if(queue.size()< maxSize){
                    System.out.println("Producer "+ Thread.currentThread().getName()+" entered. queue size: "+ queue.size());
                    queue.add(new Object());
                    System.out.println("Producer "+ Thread.currentThread().getName()+" left. queue size: "+ queue.size());
                    System.out.println();
                }
            }
        }

    }
}
