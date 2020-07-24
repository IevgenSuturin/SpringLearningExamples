package com.ysuturin.springdoc.example06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example06/application-context.xml");

        Calculator calculator = (Calculator) context.getBean("calculator");
        calculator.makeAnOperation();
    }
}
