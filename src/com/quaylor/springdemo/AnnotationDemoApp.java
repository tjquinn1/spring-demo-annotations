package com.quaylor.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        // read spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get the bean from spring
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach golfCoach = context.getBean("golfCoach", Coach.class);
        // call a method on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(golfCoach.getDailyWorkout());
        // close
        context.close();
    }
}
