package com.dazhi6.createObject.single;

/**
 * Created by Administrator on 2018/8/10.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    //私有构造函数
    private SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    }
    public void show(){
        System.out.println("this is a single pattern");
    }
}
