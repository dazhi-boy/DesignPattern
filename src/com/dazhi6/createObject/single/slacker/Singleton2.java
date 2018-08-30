package com.dazhi6.createObject.single.slacker;

/**
 * 懒汉式单例模式，是 Lazy 初始化
 * 线程安全,有加锁
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}
    public static synchronized Singleton2 getInstance(){
        if (instance==null)
            instance = new Singleton2();
        return instance;
    }
}
