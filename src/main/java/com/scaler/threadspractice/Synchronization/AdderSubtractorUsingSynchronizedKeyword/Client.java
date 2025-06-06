package com.scaler.threadspractice.Synchronization.AdderSubtractorUsingSynchronizedKeyword;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread thread1 = new Thread(adder);
        Thread thread2 = new Thread(subtractor);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count is :" + count.val);
    }
}
