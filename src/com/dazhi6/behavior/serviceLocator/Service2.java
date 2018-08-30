package com.dazhi6.behavior.serviceLocator;

/**
 * Created by Administrator on 2018/8/30.
 */
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
