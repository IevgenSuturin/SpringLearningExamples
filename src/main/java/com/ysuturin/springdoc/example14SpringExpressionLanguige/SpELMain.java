package com.ysuturin.springdoc.example14SpringExpressionLanguige;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example14/application-context.xml");
        UsualPerson person = (UsualPerson) context.getBean("personBean");
        System.out.println(person);
    }
}
