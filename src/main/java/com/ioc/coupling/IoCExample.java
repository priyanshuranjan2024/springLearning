package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCExample {
    public static void main(String[] args) {

        //firstly load the xml file
        ApplicationContext context
                =new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");

        UserManager userManagerWithDB=(UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager userManagerWithWeb=(UserManager) context.getBean("userManagerWithWebDataProvider");
        System.out.println(userManagerWithWeb.getUserInfo());

    }

}
