package com.food.logincheckmodule;


import java.util.HashMap;

public class IDandPasswords {

    HashMap <String , String> loginInfo = new HashMap<String , String>();


    public IDandPasswords(){

        loginInfo.put("h" , "1");
    }

    public HashMap getloginInfo(){

        return loginInfo;
    }
}

