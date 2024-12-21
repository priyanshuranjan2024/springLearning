package com.tight.coupling;

public class UserManager {
    //will manage all the user details
    private UserDatabase userDatabase=new UserDatabase();
    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
