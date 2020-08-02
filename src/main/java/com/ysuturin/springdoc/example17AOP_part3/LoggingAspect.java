package com.ysuturin.springdoc.example17AOP_part3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Around("@annotation(com.ysuturin.springdoc.example17AOP_part3.Log)")
    public Object log(ProceedingJoinPoint thisJoinPoint) throws Throwable{
        String methodName = thisJoinPoint.getSignature().getName();
        Object[] methodArgs = thisJoinPoint.getArgs();

        print("annotation based AOP approach");
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
