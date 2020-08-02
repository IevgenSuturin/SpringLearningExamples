package com.ysuturin.springdoc.example17AOP_part3;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class ExceptionAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @AfterThrowing(pointcut = "execution(* *(..))", throwing = "exception")
    public void processException(RuntimeException exception) throws Throwable{
        System.out.println("----------------> here");
        logger.severe(exception.getMessage());
    }
}
