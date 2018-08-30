package com.dazhi6.behavior.chainOfResponsibility;

/**
 * Created by Administrator on 2018/8/22.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
