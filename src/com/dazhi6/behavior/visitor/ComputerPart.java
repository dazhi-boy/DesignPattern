package com.dazhi6.behavior.visitor;

/**
 * Created by Administrator on 2018/8/29.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
