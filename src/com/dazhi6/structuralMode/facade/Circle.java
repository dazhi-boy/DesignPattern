package com.dazhi6.structuralMode.facade;

/**
 * 圆形
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
