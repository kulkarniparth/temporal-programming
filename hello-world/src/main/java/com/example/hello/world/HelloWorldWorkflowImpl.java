package com.example.hello.world;

import io.temporal.activity.ActivityOptions;
import io.temporal.workflow.Workflow;

import java.time.Duration;

public class HelloWorldWorkflowImpl implements HelloWorldWorkflow{

    ActivityOptions activityOptions = ActivityOptions.newBuilder()
            .setScheduleToCloseTimeout(Duration.ofSeconds(10))
            .build();

    private final Format format = Workflow.newActivityStub(Format.class, activityOptions);

    @Override
    public String getGreetings(String name) {
        return format.composeGreeting(name);
    }
}
