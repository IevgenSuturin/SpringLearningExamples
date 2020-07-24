package com.ysuturin.springdoc.example09EventDrivenEmployeeRegistration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example09/application-context.xml");
        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");

        employeeService.getApplicationContext().publishEvent(new EmployeeRegistrationEvent(new Employee("Yevhen", "Suturin")));

        context.close();
    }
}
