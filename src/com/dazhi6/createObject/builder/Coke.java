package com.dazhi6.createObject.builder;

/**
 * 可口可乐
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
