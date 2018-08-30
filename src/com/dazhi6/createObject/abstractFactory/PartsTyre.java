package com.dazhi6.abstractFactory;

/**
 * 轮胎
 */
public class PartsTyre implements Parts{
    @Override
    public void printParts() {
        System.out.println("tyre");
    }
}
