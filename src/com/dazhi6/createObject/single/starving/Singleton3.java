package com.dazhi6.createObject.single.starving;

/**
 * 饿汉式单例模式，否 Lazy 初始化
 * 多线程安全,容易产生垃圾对象
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return instance;
    }
}
