package com.scaler.threadspractice.ProducerConsumerProblem;

import java.util.Queue;

public class Consumer implements Runnable{
    Queue<Object> queue;
    int maxSize;
    public Consumer(Queue queue, int size){
        this.queue = queue;
        this.maxSize = size;
    }
    @Override
    public void run(){
        while(true){
            synchronized(queue){
                if(queue.size()>0){
                    System.out.println("Consumer "+ Thread.currentThread().getName()+" entered. queue size: "+ queue.size());
                    queue.remove();
                    System.out.println("Consumer "+ Thread.currentThread().getName()+" left. queue size: "+ queue.size());
                    System.out.println();
                }
            }
        }
    }
}
