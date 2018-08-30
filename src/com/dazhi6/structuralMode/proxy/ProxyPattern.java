package com.dazhi6.structuralMode.proxy;

/**
 * 代理模式
 */
public class ProxyPattern {
    public static void main(String [] str){
        System.out.println("----- proxy pattern start -----");

        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();

        System.out.println("----- proxy pattern end -----");
    }
}
