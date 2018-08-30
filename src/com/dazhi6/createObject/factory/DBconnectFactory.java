package com.dazhi6.createObject.factory;

/**
 * Created by Administrator on 2018/8/9.
 * 数据库连接
 */
public class DBconnectFactory {

    public DBconnect getDBconnect(String DBtype){
        DBconnect dBconnect = null;
        switch(DBtype) {
            case "sql":
                dBconnect = new DBconnectSql();
                break;
            case "mysql":
                dBconnect = new DBconnectMySql();
                break;
            case "oracle":
                dBconnect = new DBconnectOracle();
                break;
            default:
                break;
        }
        return dBconnect;
    }
}
