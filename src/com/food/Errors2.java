package com.food;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JOptionPane;


//////////////////---------------- MUTABLE CLASS-------------------- //////////////////////////////


public class Errors2 {

    private  String a;

    public Errors2(String a){

        this.a = a;

    }

    public String getMessage(){
        JOptionPane.showMessageDialog(null , a);
        return a;
    }
    public void  setMessage(String Error){

            this.a = Error;
    }


}
