package com.ysuturin.springdoc.example10JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example10Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        PersonBean personBean = context.getBean("personBean", PersonBean.class);
        System.out.println(personBean.getName());
    }
}
