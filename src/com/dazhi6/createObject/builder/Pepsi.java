package com.dazhi6.createObject.builder;

/**
 * 百世可乐
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
