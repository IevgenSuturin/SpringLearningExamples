package com.ysuturin.springdoc.example07;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("class InitHelloWorld: BeforeInitializatoin : "+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("class InitHelloWorld: AfterInitializatoin : "+beanName);
        return bean;
    }
}
