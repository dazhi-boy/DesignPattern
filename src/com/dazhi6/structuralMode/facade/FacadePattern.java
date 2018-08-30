package com.dazhi6.structuralMode.facade;

/**
 * 外观模式
 */
public class FacadePattern {
    public static void main(String [] str){
        System.out.println("----- facade pattern start -----");

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        System.out.println("----- facade pattern start -----");
    }
}
