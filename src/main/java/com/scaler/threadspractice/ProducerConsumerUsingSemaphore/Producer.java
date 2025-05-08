package com.scaler.threadspractice.ProducerConsumerUsingSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    Queue<Object> queue;
    int maxSize;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    public Producer(Queue queue, int size, Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.queue = queue;
        this.maxSize = size;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run(){
        while(true){
               try {
                       producerSemaphore.acquire();
                       synchronized (queue) {
                           System.out.println("Producer " + Thread.currentThread().getName() + " entered. queue size: " + queue.size());
                           queue.add(new Object());
                           System.out.println("Producer " + Thread.currentThread().getName() + " left. queue size: " + queue.size());
                           System.out.println();
                       }
                       consumerSemaphore.release();
               } catch (Exception e) {
                   System.out.println("error occurred in Producer");
               }
        }
    }
}
