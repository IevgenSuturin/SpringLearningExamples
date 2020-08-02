package com.ysuturin.springdoc.example15AOP_part1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOP1_Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example15/aop.xml");

        UserDao userDao = (UserDao) context.getBean("userDao");
        System.out.println("----> " + userDao.getUser(1));

    }
}
