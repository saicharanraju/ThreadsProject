package com.scaler.threadspractice.Simple;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args){
        System.out.println("main started");

//        for(int i = 0; i< 100 ; i++) {
//            NumberPrinterTask task = new NumberPrinterTask(i);
//            Thread thread = new Thread(task);
//            thread.start();
//        }
        Executor executor = Executors.newCachedThreadPool();
        //Executor executor = Executors.newFixedThreadPool(10);
        for(int i=0; i<100; i++){
            NumberPrinterTask task = new NumberPrinterTask(i);
            executor.execute(task);
            if(i == 5 || i == 15 || i == 45 || i == 80){
                System.out.println("DEBUG");
            }
        }
        System.out.println("main ended");
    }
}
