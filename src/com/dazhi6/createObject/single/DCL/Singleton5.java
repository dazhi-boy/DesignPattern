package com.dazhi6.createObject.single.DCL;

/**
 * 登记式/静态内部类
 * lazy实例化
 * 线程安全
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5(){}
    public static final Singleton5 getInstance (){
        return SingletonHolder.INSTANCE;
    }
}
