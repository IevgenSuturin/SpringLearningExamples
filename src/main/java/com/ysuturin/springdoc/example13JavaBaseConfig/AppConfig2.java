package com.ysuturin.springdoc.example13JavaBaseConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:example13/jdbc.properties")
public class AppConfig2 {
    @Value("${jdbc.url}")
    private String url;

    @Autowired
    private Environment env;

    public String getUrl() {
        return url;
    }

    public Environment getEnv() {
        return env;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);

        AppConfig2 appConfig2 = context.getBean(AppConfig2.class);

        System.out.println(appConfig2.getEnv().getProperty("jdbc.url"));
        System.out.println(appConfig2.getEnv().getProperty("jdbc.username"));
        System.out.println(appConfig2.getEnv().getProperty("jdbc.password"));

        System.out.println(appConfig2.getUrl());
    }
}
