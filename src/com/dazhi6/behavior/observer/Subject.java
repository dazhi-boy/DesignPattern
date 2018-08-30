package com.dazhi6.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主体
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){//附加
        observers.add(observer);
    }

    public void notifyAllObservers(){ //通知所有观察员
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
