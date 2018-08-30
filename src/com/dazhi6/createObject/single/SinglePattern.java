package com.dazhi6.createObject.single;

/**
 * 单例模式
 */
public class SinglePattern {
    public static void main(String [] str){
        System.out.println("----- single pattern start -----");
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.show();
        System.out.println("----- single pattern end -----");

        Singleton.INSTANCE.whateverMethod();
    }
}
