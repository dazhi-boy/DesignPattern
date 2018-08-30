package com.dazhi6.behavior.visitor;

/**
 * Created by Administrator on 2018/8/29.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
