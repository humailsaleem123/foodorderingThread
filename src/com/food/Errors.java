package com.food;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JOptionPane;


///////// IMMUTABLE CLASSS /////////////////////////////////////

public class Errors {

private final String s;


public Errors( final String s){

    this.s = s;

}

    public final String getErrorMessage(){

//        JOptionPane.showMessageDialog(null, "Items Are Not Selected Please Select Items And then Try Again !!");

        JOptionPane.showMessageDialog(null , s);
        return s;
    }

}
