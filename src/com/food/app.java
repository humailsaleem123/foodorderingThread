package com.food;

import com.food.logincheckmodule.IDandPasswords;
import com.food.logincheckmodule.LoginPage;

import javax.swing.*;

public class app  {




    public static void main(String[] args) {

        IDandPasswords idandpasswords = new IDandPasswords();

        LoginPage loginpage = new LoginPage(idandpasswords.getloginInfo());




}


}
