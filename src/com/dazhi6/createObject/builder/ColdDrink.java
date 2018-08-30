package com.dazhi6.createObject.builder;

/**
 * 冷饮
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
