package com.ysuturin.springdoc.example09EventDrivenEmployeeRegistration;

import org.springframework.context.ApplicationEvent;

public class EmployeeRegistrationEvent extends ApplicationEvent {
    private Employee employee;

    public EmployeeRegistrationEvent(Employee employee){
        super(employee);
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
