package com.ysuturin.springdoc.example18AOP_part4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class LoggingAspect1 {

    @Before("execution(public String com.ysuturin.springdoc.example18AOP_part4.Triangle.getName())")
    public void loggingAdviceGetName(){
        System.err.println("Advice run getName  method will be called");
    }

    @Before("execution(public * *.draw())")
    public void loggingAdviceDraw(){
        System.err.println("Advice run draw  method will be called");
    }

    @Pointcut("execution(* get*())")
    public void allGetters(){}

    @Before("allGetters()")
    public void loggingAllGetters(){
        System.err.println("Advice run. A getter method will be called from LoggingAspect1");
    }

    @Pointcut("within(com.ysuturin.springdoc.example18AOP_part4.Circle)")
    public void allCircleMethod(){}

    @After("allCircleMethod")
    public void loggingAdvice(JoinPoint joinPoint){
        System.err.println("Advice run. A circle method has been called.");
        System.err.println(joinPoint.toString());
        System.err.println(joinPoint.getTarget());
    }

    @AfterReturning("args(name)")
    public void stringArgumentMethods(String name){
        System.err.println("A method that takes String argument has been called. This value is " + name);
    }

    @AfterThrowing(pointcut="args(name)", throwing = "exception")
    public void exceptionAdvice(String name, RuntimeException exception){
        System.err.println("An exception has been thrown " + exception + " Name to set is: " + name);
    }
}
