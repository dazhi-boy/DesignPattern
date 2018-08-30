package com.dazhi6.createObject.single.DCL;

/**
 * 双解锁双重校验锁double-checked locking
 * lazy实例化，多线程安全，性能较高
 */
public class Singleton4 {
    private volatile static Singleton4 instance;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null)
                    instance = new Singleton4();
            }
        }
        return instance;
    }
}
