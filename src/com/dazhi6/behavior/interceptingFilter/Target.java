package com.dazhi6.behavior.interceptingFilter;

/**
 * 靶标
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
