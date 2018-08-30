package com.dazhi6.createObject.prototype;

/**
 * 正方形
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("draw square");
    }
}
