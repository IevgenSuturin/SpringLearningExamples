package com.ysuturin.springdoc.example09EventDrivenEmployeeRegistration;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class WriteToDataBaseAnnotationDriven {

    @EventListener
    public void WriteToDataBase(EmployeeRegistrationEvent employeeRegistrationEvent) {
        System.out.println("Annotation config event listener : " + employeeRegistrationEvent.getEmployee());
    }
}
