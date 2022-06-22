package com.food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;


public class DataBase {

    private static String DATABASE_EXCEPTION = "DATABASE_EXCEPTION";


public static  Connection ConnectDb(){

    try{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/food_order", "root" , "");

        System.out.println("Connected to Database !!!!");


        return conn;


    }

    catch(SQLException | java.lang.ClassNotFoundException e){

        JOptionPane.showMessageDialog(null ,  e);
        return null;
    }

}

}
