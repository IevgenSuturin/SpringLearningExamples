package com.ysuturin.springdoc.example12JavaBaseConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example12Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean2.class);

        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        Bean2 bean2 = context.getBean("bean2", Bean2.class);

        bean1.print();
        bean2.print();
    }
}
