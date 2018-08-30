package com.dazhi6.structuralMode.facade;

/**
 * 方形
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
