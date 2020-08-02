package com.ysuturin.springdoc.example16AOP_part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOP2_Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example16/aop.xml");

        UserDao userDao = (UserDao) context.getBean("userDao");
        System.out.println("****----> " + userDao.getUser(1));

    }
}
