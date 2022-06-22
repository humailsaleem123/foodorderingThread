package com.food.logincheckmodule;

public class WrongUser extends getUser {

    @Override
    public String login()
    {

        return "Invalid UserName or Password";
    }

    @Override
    public boolean isNull()
    {

        return true;
    }
}
