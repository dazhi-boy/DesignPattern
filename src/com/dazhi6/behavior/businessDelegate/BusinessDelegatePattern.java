package com.dazhi6.behavior.businessDelegate;

/**
 * 业务代表模式
 */
public class BusinessDelegatePattern {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
