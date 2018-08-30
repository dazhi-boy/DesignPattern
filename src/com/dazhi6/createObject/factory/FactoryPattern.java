package com.dazhi6.createObject.factory;

/**
 * Created by Administrator on 2018/8/8.
 */
public class FactoryPattern {
    public static void main(String [] str){
        System.out.println("----- factory pattern start -----");
        DBconnectFactory dBconnectFactory = new DBconnectFactory();

        DBconnect sql = dBconnectFactory.getDBconnect("sql");
        sql.connect();

        DBconnect mySql = dBconnectFactory.getDBconnect("mysql");
        mySql.connect();

        DBconnect oracle = dBconnectFactory.getDBconnect("oracle");
        oracle.connect();

        System.out.println("----- factory pattern end -----");
    }
}
