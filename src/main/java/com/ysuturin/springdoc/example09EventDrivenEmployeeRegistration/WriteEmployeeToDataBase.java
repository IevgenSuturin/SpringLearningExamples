package com.ysuturin.springdoc.example09EventDrivenEmployeeRegistration;

import org.springframework.context.ApplicationListener;

public class WriteEmployeeToDataBase implements ApplicationListener<EmployeeRegistrationEvent> {
    @Override
    public void onApplicationEvent(EmployeeRegistrationEvent employeeRegistrationEvent) {
        System.out.println("Writing to database " + employeeRegistrationEvent.getEmployee());
    }
}