package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider=new UserDatabaseProvider();
        //here the user data provider is the interface which is getting overridden by the userdatabaseprovider()
        UserManager userManagerWithDB=new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());


        //fetching data from web
        UserDataProvider webProvider=new WebDatabaseProvider();
        UserManager userManagerWithWeb=new UserManager(webProvider);
        System.out.println(userManagerWithWeb.getUserInfo());
    }

}
