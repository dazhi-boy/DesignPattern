package com.dazhi6.createObject.prototype;

/**
 * 圆
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("draw circle");
    }
}
