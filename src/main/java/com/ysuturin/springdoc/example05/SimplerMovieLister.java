package com.ysuturin.springdoc.example05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimplerMovieLister {

    private MovieFinder movieFinder;

    @Autowired
    public SimplerMovieLister(@Qualifier("movieFinder21") MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

//    @Autowired
//    @Qualifier("movieFinder23")
//    public void setMovieFinder(MovieFinder movieFinder) {
//        System.out.println("--->");
//        this.movieFinder = movieFinder;
//    }

    public MovieFinder getMovieFinder() {
        return movieFinder;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("example05/application-context.xml");
        SimplerMovieLister simplerMovieLister = (SimplerMovieLister) context.getBean("simpleMovieLister");
        System.out.println(simplerMovieLister.getMovieFinder().getName());
        context.close();
    }
}
