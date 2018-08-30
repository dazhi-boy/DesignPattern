package com.dazhi6.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 经纪人
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
