package com.fardium.intro;

import org.springframework.scheduling.quartz.QuartzJobBean;
import org.quartz.JobExcecutionException;
import org.quartz.JobExcecutionContext;

public class RunMeJob extends QuartzJobBean {

    private RunMeTask runMeTask;

    public void setRunMeTask(RunMeTask runMeTask) {
        this.runMeTask = runMeTask;

    }

    protected void executeInternal(JobExcecutionContext context)
        throws JobExecutionException {

        runMeTask.printMe();
    }

}
