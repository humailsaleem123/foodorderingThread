package com.food;


public class FOOD  {

    public String itemName;
    public String itemPrice;



    public synchronized void getAllOrderITems()
    {
        System.out.println("itemName="+itemName);
        MainMenu.model.addRow(new Object[]{itemName , itemPrice});

        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread interrupted.");
        }

        MainMenu.pay_price.setText(String.valueOf(totalAmount.Total_Amount()));

    }

    public synchronized void clearAllItems()
    {
        System.out.println("deleted");

        MainMenu.model.setRowCount(0);

    }

    public FOOD(){


    }






}
