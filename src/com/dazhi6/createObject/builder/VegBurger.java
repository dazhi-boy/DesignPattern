package com.dazhi6.createObject.builder;

/**
 * 素食汉堡
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "veg burger";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
