package com.food;

public class myThread2 extends Thread {

    totalAmount Total_Amount;
    myThread2( totalAmount Total_Amount){

        this.Total_Amount = Total_Amount;
    }

    public void run(){

        Total_Amount.Total_Amount();
    }
}
