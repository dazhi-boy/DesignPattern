package com.dazhi6.structuralMode.decorator;

/**
 * 装饰器模式
 */
public class DecoratorPattern {
    public static void main(String [] str){
        System.out.println("----- decorator pattern start -----");

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        System.out.println("----- decorator pattern end -----");
    }
}
