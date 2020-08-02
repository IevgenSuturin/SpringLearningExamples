package com.ysuturin.springdoc.example08ApplicationEvent;

import org.springframework.context.event.EventListener;

public class MultipleEventListener {

    @EventListener
    public void customEventReaction(CustomEvent event){
        System.out.println("Here is multiple event reaction component. CustomEvent: " + event.toString());
    }

    @EventListener
    public void secondCustomEventReaction(SecondCustomEvent event){
        System.out.println("Here is multiple event reaction component. SecondCustomEvent: " + event.toString());
    }
}
