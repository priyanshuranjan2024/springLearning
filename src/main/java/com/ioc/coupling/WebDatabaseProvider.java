package com.ioc.coupling;

public class WebDatabaseProvider implements UserDataProvider {

    @Override

    public String getUserDetails(){
        return "User data from the web";
    }


}
