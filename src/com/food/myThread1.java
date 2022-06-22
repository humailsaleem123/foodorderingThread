package com.food;

public class myThread1 extends Thread {

    FOOD food;

    myThread1( FOOD food){

        this.food = food;

    }

    public void run(){

           food.getAllOrderITems();

    }


}
