package com.dazhi6.behavior.state;

/**
 * 状态模式
 */
public class StatePattern {
    public static void main(String [] str){
        System.out.println("----- state pattern start -----");

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());

        System.out.println("----- state pattern end -----");
    }
}
