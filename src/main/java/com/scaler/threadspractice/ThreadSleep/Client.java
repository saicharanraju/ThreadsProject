package com.scaler.threadspractice.ThreadSleep;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main started");
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("main hitting cache");
        Thread.sleep(1000);
        System.out.println("main ended");
    }
}
