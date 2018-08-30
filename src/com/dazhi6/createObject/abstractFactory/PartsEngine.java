package com.dazhi6.abstractFactory;

/**
 * 引擎
 */
public class PartsEngine implements Parts{
    @Override
    public void printParts() {
        System.out.println("engine");
    }
}
