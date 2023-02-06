package com.example.hello.world;

public class FormatImpl implements Format{

    @Override
    public String composeGreeting(String name) {
        sleep(240);
        return "Hello "+name+" !!";
    }

    private void sleep(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
