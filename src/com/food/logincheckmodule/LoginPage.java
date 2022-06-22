package com.food.logincheckmodule;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public  class LoginPage implements ActionListener  {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userId = new JTextField();
    JPasswordField userPass = new JPasswordField();
    JLabel userIdLabel = new JLabel("User Id: ");
    JLabel passIdLabel = new JLabel("Password : ");
    JLabel message = new JLabel();




    HashMap<String, String> loginInfo = new HashMap<String , String>();

    public LoginPage(HashMap<String, String> loginInfoOriginal){

        loginInfo = loginInfoOriginal;

        userIdLabel.setBounds(50,100,75,25);
        passIdLabel.setBounds(50,150,75,25);

        message.setBounds(125,250,250,35);
        message.setFont(new Font(null, Font.ITALIC, 25));

        userId.setBounds(125,100,200,25);
        userPass.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIdLabel);
        frame.add(passIdLabel);
        frame.add(message);
        frame.add(userId);
        frame.add(userPass);
        frame.add(loginButton);
        frame.add(resetButton);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

    }

    @Override
    public  void actionPerformed(ActionEvent e) {

        if(e.getSource() == resetButton){

            userId.setText("");
            userPass.setText("");
        }

        if(e.getSource() == loginButton){

            String userID = userId.getText();
            String userPASS = String.valueOf(userPass.getPassword());

          //  if(loginInfo.containsKey(userID)){

                if(loginInfo.containsKey(userID) && loginInfo.containsValue(userPASS))
                {
                    message.setForeground(Color.green);
//                    message.setText("Login Successfull !!!");
                    frame.dispose();
                    new Menu(userID);
                }

                    WrongUser wrongUser = new WrongUser();

                    message.setForeground(Color.red);
                    message.setText(wrongUser.login());



        }

    }


}

