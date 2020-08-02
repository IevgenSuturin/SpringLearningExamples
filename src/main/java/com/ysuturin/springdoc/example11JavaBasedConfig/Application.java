package com.ysuturin.springdoc.example11JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService(){
        return () -> "Hello world!";
    }
}
