package com.food;

public class totalAmount {


    public static synchronized Integer Total_Amount(){

        int total = 0;

        for(int count = 0; count<MainMenu.order_table.getRowCount(); count++ ){

            total = total + Integer.parseInt(MainMenu.order_table.getValueAt(count,1).toString());
        }
        try{
            Thread.sleep(400);
        }catch(Exception e){
            System.out.println(e);
        }

        return total;


    }

//    public synchronized void settTextAmount(){
//
//        MainMenu.pay_price.setText(String.valueOf(Total_Amount()));
//    }

}

