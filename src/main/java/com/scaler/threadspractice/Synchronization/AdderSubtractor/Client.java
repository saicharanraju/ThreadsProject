package com.scaler.threadspractice.Synchronization.AdderSubtractor;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread Thread1 = new Thread(adder);
        Thread Thread2 = new Thread(subtractor);

        Thread1.start();
        Thread2.start();

        Thread1.join();
        Thread2.join();

        System.out.println("Count is :" + count.val);
    }
}
