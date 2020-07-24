package com.ysuturin.springdoc.example07;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.sql.Connection;

public class Bean1 implements InitializingBean, DisposableBean {

    private Connection connection;

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside afterPropertiesSet method");
    }

    public void init(){
        System.out.println("User custom init method for ExlTestBean");
    }

    public void cleanup(){
        System.out.println("User custom init cleanup for ExlTestBean");
    }

}
