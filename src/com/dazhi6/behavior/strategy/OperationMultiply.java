package com.dazhi6.behavior.strategy;

/**
 * 乘操作
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
