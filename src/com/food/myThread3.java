package com.food;

public class myThread3 extends Thread{

    FOOD food;

    myThread3( FOOD food){

        this.food = food;

    }

    public void run(){

        food.clearAllItems();

    }
}
