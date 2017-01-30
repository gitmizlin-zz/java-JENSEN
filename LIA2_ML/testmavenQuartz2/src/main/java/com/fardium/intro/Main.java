package com.fardium.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mizuho on 2017-01-26.
 */
public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Object b1 = applicationContext.getBean("hw1");

        HelloWorld helloWorld = (HelloWorld) b1;
        helloWorld.printText();
    }
}
