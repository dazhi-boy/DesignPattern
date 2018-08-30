package com.dazhi6.behavior.businessDelegate;

/**
 * Created by Administrator on 2018/8/29.
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
