package com.dazhi6.createObject.factory;

/**
 * Created by Administrator on 2018/8/9.
 */
public class DBconnectOracle implements DBconnect {
    @Override
    public void connect() {
        System.out.println("this is oracle connect");
    }
}
