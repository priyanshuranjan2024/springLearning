package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    //this is overriding the implementation of the method in userdataprovider interface
    //this will interact with the database
    public String getUserDetails(){
        //directly access database
        return "User details";
    }
}
