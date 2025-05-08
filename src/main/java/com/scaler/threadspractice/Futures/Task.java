package com.scaler.threadspractice.Futures;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("work assigned to Engineer");
        Thread.sleep(5000);
        System.out.println("Engineer work is done");
        System.out.println("I'll go to cafe");
        System.out.println("I'll go for a movie");
        return 99;
    }
}
