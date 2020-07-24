package com.ysuturin.springdoc.example06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("calculator")
public class Calculator {

    @Autowired
    private Adder adder;

    @Autowired
    private Multiplier multiplier;

    public void makeAnOperation(){
        int sum = adder.add(1, 2);
        System.out.println("sum = " + sum);
        int mult = multiplier.multiply(2, 3);
        System.out.println("mult = " + mult);
    }
}
