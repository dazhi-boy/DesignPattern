package com.dazhi6.structuralMode.bridge;

/**
 * 桥接模式
 */
public class BridgePattern {
    public static void main (String [] str){
        System.out.println("----- bridge pattern start -----");

        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

        System.out.println("----- bridge pattern start -----");
    }
}
