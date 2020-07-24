package com.ysuturin.springdoc.example04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example04/application-context.xml");

        LoginManager loginManager = (LoginManager) context.getBean("loginManager");
        System.out.println(loginManager);

        UserDirectorySearch userDirectorySearch = (UserDirectorySearch) context.getBean("userDirectorySearch");
        System.out.println(userDirectorySearch);

        UserInfo userInfo = (UserInfo) context.getBean("userInfo");
        System.out.println(userInfo);
    }
}
