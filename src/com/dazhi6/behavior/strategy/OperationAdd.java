package com.dazhi6.behavior.strategy;

/**
 * 加操作
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
