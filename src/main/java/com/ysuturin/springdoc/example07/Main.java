package com.ysuturin.springdoc.example07;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example07/application-context.xml");

        Bean1 bean1 = (Bean1) context.getBean("bean1");
        Bean2 bean2 = (Bean2) context.getBean("bean2");

        context.close();
    }
}
