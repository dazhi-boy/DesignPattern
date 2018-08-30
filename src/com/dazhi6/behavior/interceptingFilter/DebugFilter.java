package com.dazhi6.behavior.interceptingFilter;

/**
 * Created by Administrator on 2018/8/29.
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
