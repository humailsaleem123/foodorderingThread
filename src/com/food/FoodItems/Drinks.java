package com.food.FoodItems;

import java.util.Hashtable;

public class Drinks extends TemplateFood{


    @Override
    public String FoodItems(String Items) {

        Hashtable<String,String > ht2 = new Hashtable<String,String>();
        String Item="";


        ht2.put("Pepsi","200");
        ht2.put("Fanta","120");
        ht2.put("7UP","150");

        ht2.put("Pepsi_image","D:\\Images\\Pepsi.jpg");
        ht2.put("Fanta_image","D:\\Images\\Fanta.jpg");
        ht2.put("7UP_image","D:\\Images\\7UP.jpg");


        if (ht2.containsKey(Items)) {
            Item = ht2.get(Items);


        }

        return Item;
    }
}
