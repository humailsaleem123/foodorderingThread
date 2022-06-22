package com.food.FoodItems;

import java.util.Hashtable;

public class Pizza extends TemplateFood{


    @Override
    public String FoodItems(String Items) {

        Hashtable<String,String > ht2 = new Hashtable<String,String>();

        String Item="";


        ht2.put("Chicken Fajita","1000");
        ht2.put("BBQ Ranch","800");
        ht2.put("Phantom","1200");

        ht2.put("Chicken Fajita_image","D:\\Images\\Fajita.jpg");
        ht2.put("BBQ Ranch_image","D:\\Images\\bbq_ranch.jpeg");
        ht2.put("Phantom_image","D:\\Images\\Phantom.jpg");


        if (ht2.containsKey(Items)) {
            Item = ht2.get(Items);


        }

        return Item;
    }
}
