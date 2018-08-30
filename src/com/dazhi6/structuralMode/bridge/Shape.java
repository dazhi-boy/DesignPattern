package com.dazhi6.structuralMode.bridge;

/**
 * Created by Administrator on 2018/8/16.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
