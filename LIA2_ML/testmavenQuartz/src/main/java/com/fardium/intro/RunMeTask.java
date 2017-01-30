package com.fardium.intro;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class RunMeTask implements org.quartz.Job {

    public void printMe() {

            System.out.println("Spring 3 + Quartz 1.8.6 ~");

    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        printMe();
    }
}