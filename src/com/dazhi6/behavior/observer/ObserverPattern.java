package com.dazhi6.behavior.observer;

/**
 * 观察者模式
 */
public class ObserverPattern {
    public static void main(String [] str){
        System.out.println("----- observer pattern start -----");

        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        System.out.println("----- observer pattern start -----");
    }
}