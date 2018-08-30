package com.dazhi6.createObject.builder;

/**
 * 肌肉汉堡
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
