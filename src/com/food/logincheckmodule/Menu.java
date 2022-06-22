package com.food.logincheckmodule;


import com.food.MainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// IF USER'S INFO IS CORRECT THEN ACCESS TO MAIN_MENU

public class Menu extends getUser{


    JButton Exit = new JButton("EXIT");
    JButton order = new JButton("ORDER");
    JFrame frame = new JFrame();

    abc xyz = new abc();

    public Menu(String Username){
        this.Username=Username;
         login();
    }
    public Menu(){

    }

    @Override
    public boolean isNull() {

        return false;
    }

    @Override
    public String login() {
//        JFrame frame = new JFrame();
        JLabel mainmenuLabel = new JLabel("Welcome " + Username);

        mainmenuLabel.setBounds(200,10,200,35);
        mainmenuLabel.setFont(new Font(null, Font.PLAIN,20));

        JLabel heading = new JLabel("Welcome To Food Ordering System");
        heading.setBounds (55, 95, 500, 30);
        heading.setFont(new Font(null, Font.PLAIN,25));

        order = new JButton("ORDER");
        order.setBounds(200, 175, 100, 30);
        order.setFocusable(false);
        Exit = new JButton("EXIT");
        Exit.setBounds(200, 285, 100, 30);
        Exit.setFocusable(false);
        frame.add(mainmenuLabel);
        frame.add(heading);
        frame.add(order);
        frame.add(Exit);


        Exit.addActionListener(xyz);
        order.addActionListener(xyz);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520,520);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        return Username;
    }

    public class abc implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {


        System.out.println("MAIN MENU 2222");

        if(e.getSource()== order){
            new MainMenu();
            System.out.println("Hello Another Menu");



        }

        else if(e.getSource()==Exit){

            System.out.println("Exit Gui");
            System.exit(0);

        }
    }

    }
}







