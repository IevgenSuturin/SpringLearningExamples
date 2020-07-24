package com.ysuturin.springdoc.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStartMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example1/context.xml");

        MovieListener listener = (MovieListener) context.getBean("movieListener");
        System.out.println(listener.moviesDirectByString("director"));
    }
}
