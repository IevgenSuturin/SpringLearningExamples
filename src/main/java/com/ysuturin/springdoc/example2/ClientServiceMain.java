package com.ysuturin.springdoc.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientServiceMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example2/context.xml");

        ClientService clientService1 = (ClientService) context.getBean("clientService1");
        System.out.println(clientService1);
        ClientService clientService2 = (ClientService) context.getBean("clientService2");
        System.out.println(clientService2);

        BusinessService businessService1 = (BusinessService) context.getBean("businessService1");
        System.out.println(businessService1);

        BusinessService businessService2 = (BusinessService) context.getBean("businessService2");
        System.out.println(businessService2);

        ClientService clientService3 = (ClientService) context.getBean("clientService3");
        System.out.println(clientService3);
        ClientService clientService4 = (ClientService) context.getBean("clientService4");
        System.out.println(clientService4);

        ClientService clientService5 = (ClientService) context.getBean("clientService5");
        System.out.println(clientService5);
    }
}
