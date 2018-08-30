package com.dazhi6.abstractFactory;

/**
 * 汽车的抽象工厂
 */
public abstract class CarAbstractFactory {
    public abstract Brand getBrand(String brand);
    public abstract Parts getParts(String parts);
}
