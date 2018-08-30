package com.dazhi6.createObject.single.slacker;

/**
 * 懒汉式但里面模式，是 Lazy 初始化
 * 线程不安全，多线程不能正常工作
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if (instance==null)
            instance = new Singleton1();
        return instance;
    }
}
