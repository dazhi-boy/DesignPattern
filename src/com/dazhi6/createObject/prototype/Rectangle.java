package com.dazhi6.createObject.prototype;

/**
 * 矩形
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("draw rectangle");
    }
}
