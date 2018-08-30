package com.dazhi6.behavior.compositeEntity;

/**
 * 组合实体模式
 */
public class CompositeEntityPattern {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
