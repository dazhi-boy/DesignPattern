package com.dazhi6.behavior.visitor;

/**
 * 访问者模式
 */
public class VisitorPattern {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
