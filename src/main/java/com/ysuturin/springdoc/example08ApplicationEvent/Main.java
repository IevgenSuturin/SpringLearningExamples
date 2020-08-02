package com.ysuturin.springdoc.example08ApplicationEvent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example08/application-context.xml");

        CommandManager commandManager = (CommandManager) context.getBean("commandManager");

        commandManager.getApplicationContext().publishEvent(new CustomEvent("test"));
        commandManager.getApplicationContext().publishEvent(new SecondCustomEvent("test2"));

        context.close();
    }
}
