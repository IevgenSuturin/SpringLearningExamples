package com.ysuturin.springdoc.example08ApplicationEvent;

import org.springframework.context.ApplicationListener;

public class Bean2 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println("CustomEvent received at Bean2");
    }
}
