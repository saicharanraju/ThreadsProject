package com.scaler.threadspractice.Simple;

public class NumberPrinterTask implements Runnable {
    int number;
    public NumberPrinterTask(Integer Number){
        this.number = Number;
    }
    @Override
    public void run(){
            System.out.println("Number is :" + this.number + " Printed by: " + Thread.currentThread().getName());
    }
}
