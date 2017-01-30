package com.fardium.intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mizuho on 2017-01-26.
 */


public class App {

    public static void main( String[] args ) throws Exception
    {
        new ClassPathXmlApplicationContext("Spring-Quartz.xml");
    }
}