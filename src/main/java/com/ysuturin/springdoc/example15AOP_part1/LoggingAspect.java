package com.ysuturin.springdoc.example15AOP_part1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class LoggingAspect {

    @Pointcut("execution(* *.*User(..))")
    public void userMethod(){
        System.out.println("----> never called ");
    }

    @Around("userMethod()")
    public Object log(ProceedingJoinPoint thisJoinPoint) throws Throwable{
        String methodName = thisJoinPoint.getSignature().getName();
        Object[] methodArgs = thisJoinPoint.getArgs();

        print("Call method " + methodName + " with args " + Arrays.asList(methodArgs).stream().reduce(
                "", (left, right) -> left.toString() + " " + right.toString()
        ));

        Object result = thisJoinPoint.proceed();

        print("Method " + methodName + " return result " + result);

        return result;
    }

    private void print(String toLog){
        System.out.println(toLog);
    }
}
