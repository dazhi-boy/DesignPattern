package com.dazhi6.behavior.chainOfResponsibility;

/**
 * Created by Administrator on 2018/8/22.
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
