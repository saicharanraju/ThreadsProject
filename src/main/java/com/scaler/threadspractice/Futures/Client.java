package com.scaler.threadspractice.Futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Task task = new Task();

        System.out.println("created task");
        Future<Integer> future = executorService.submit(task);


        System.out.println("work assigned to Engineer");
        System.out.println("I'll go to cafe");
        System.out.println("I'll go for a movie");

        //check if work is done by the engineer

        System.out.println("chekcing if work is done by engineer");
        if(future.isDone()){
            System.out.println("work is done");
            return;
        }

        System.out.println("work is not done yet");
        System.out.println("waiting for work to be done");
        Integer result = future.get();

        System.out.println("work is done");
        System.out.println("result is " + result);

    }
}
