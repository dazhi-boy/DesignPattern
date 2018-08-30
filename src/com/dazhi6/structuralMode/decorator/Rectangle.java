package com.dazhi6.structuralMode.decorator;

/**
 * 矩形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
