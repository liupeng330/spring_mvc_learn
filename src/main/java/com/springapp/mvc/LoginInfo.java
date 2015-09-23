package com.springapp.mvc;

/**
 * Created by peng on 9/23/15.
 */
public class LoginInfo
{
    public String getPassword()
    {
        return password;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    private String userName;
    private String password;


}
