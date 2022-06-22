package com.food;

public class ClassNotFoundException extends Throwable {

    static void fun()
    {
        try
        {
            throw new java.lang.ClassNotFoundException("Class Not found...");
        }

             catch (java.lang.ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
