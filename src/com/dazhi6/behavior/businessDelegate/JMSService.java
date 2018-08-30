package com.dazhi6.behavior.businessDelegate;

/**
 * Created by Administrator on 2018/8/29.
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
