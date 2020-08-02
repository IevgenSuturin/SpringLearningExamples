package com.ysuturin.springdoc.example08ApplicationEvent;

import org.springframework.context.ApplicationEvent;

public class SecondCustomEvent extends ApplicationEvent {
    private static final long serialVersionUID = 3545745837098118673L;


    public SecondCustomEvent(Object source) {
        super(source);
    }
}
