package com.dazhi6.behavior.interpreter;

/**
 * 终端表达式
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){ //包含
            return true;
        }
        return false;
    }
}
