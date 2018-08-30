package com.dazhi6.abstractFactory;

/**
 * 车灯
 */
public class PartsLighting implements Parts{
    @Override
    public void printParts() {
        System.out.println("lighting");
    }
}
