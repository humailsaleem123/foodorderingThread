package com.food.FoodItems;

import java.util.Hashtable;

public class Burger extends TemplateFood{


    @Override
    public String FoodItems(String Items) {

        System.out.println(Items);

        Hashtable<String,String > ht2 = new Hashtable<String,String>();

        String Item="";

        ht2.put("Chicken","200");
        ht2.put("Zinger","500");
        ht2.put("Beef","300");

        ht2.put("Chicken_image","D:\\Images\\chicken_burger.jpg");
        ht2.put("Zinger_image","D:\\Images\\zinger_burger.jpg");
        ht2.put("Beef_image","D:\\Images\\beef_burger.png");

        if (ht2.containsKey(Items)) {
            Item = ht2.get(Items);


        }

        return Item;
    }
}
