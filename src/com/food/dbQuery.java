package com.food;


import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class dbQuery    {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void InsertQuery(Connection conn) throws ClassNotFoundException {

        conn = DataBase.ConnectDb();

        String sql = "INSERT INTO orders(Item_Name , Total_Price ) VALUES( ? , ? )";

        try{

            Class.forName("com.food.DataBase");

            pst = conn.prepareStatement(sql);
            pst.setString(1, String.valueOf(MainMenu.getDataTable()));
            pst.setString(2, MainMenu.pay_price.getText());

            System.out.println("Execute Query !!!!!!!!");
            pst.execute();


            JOptionPane.showMessageDialog(null, "Data Saved Successfully !!!");
        }

        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }

}
