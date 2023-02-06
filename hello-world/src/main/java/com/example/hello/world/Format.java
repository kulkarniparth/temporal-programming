package com.example.hello.world;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface Format {

    @ActivityMethod
    String composeGreeting(String name);
}
