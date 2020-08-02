package com.ysuturin.springdoc.example17AOP_part3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOP3_Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example18/aop.xml");

        UserDao userDao = (UserDao) context.getBean("userDao");
        System.out.println("****////----> " + userDao.getUser(1));

        System.out.println("Exception should be processed");
    }
}
