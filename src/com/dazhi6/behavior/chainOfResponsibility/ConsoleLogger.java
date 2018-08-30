package com.dazhi6.behavior.chainOfResponsibility;

/**
 * Created by Administrator on 2018/8/22.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
