package com.ysuturin.springdoc.example18AOP_part4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOP4_MAin {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example18/aop.xml");

        Triangle triangle = (Triangle) context.getBean("triangle");

        triangle.draw();
        System.out.println(triangle.getName());
        triangle.setName("new_triangle_name");
        try{
            triangle.setNameAndThrowException("exception_name");
        } catch (Exception ex){

        }

        System.out.println(triangle.getColor());

        triangle.getPoints().forEach(point -> {
            System.out.println(point.getName());
            point.draw();
        });

        Circle circle = (Circle) context.getBean("circle");
        System.out.println(circle.area());
    }
}
