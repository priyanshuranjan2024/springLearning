package com.tight.coupling;

public class UserDatabase {
    //this will interact with the database
    public String getUserDetails(){
        //directly access database
        return "User details";
    }
}
