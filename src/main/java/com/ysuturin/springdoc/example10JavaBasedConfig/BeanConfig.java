package com.ysuturin.springdoc.example10JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public PersonBean personBean(){
        PersonBean personBean = new PersonBean("Johnson");
        return personBean;
    }
}
