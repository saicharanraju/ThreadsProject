package com.scaler.threadspractice.ProducerConsumerUsingSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    Queue<Object> queue;
    int maxSize;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    public Consumer(Queue queue, int size, Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.queue = queue;
        this.maxSize = size;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run(){
        while(true){
            try{
                consumerSemaphore.acquire();
                synchronized(queue) {
                    System.out.println("Consumer " + Thread.currentThread().getName() + " entered. queue size: " + queue.size());
                    queue.remove();
                    System.out.println("Consumer " + Thread.currentThread().getName() + " left. queue size: " + queue.size());
                    System.out.println();
                }
                producerSemaphore.release();
              }
            catch(Exception e){
                System.out.println("error occurred in Consumer");
            }

        }
    }
}
