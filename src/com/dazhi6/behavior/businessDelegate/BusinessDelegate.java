package com.dazhi6.behavior.businessDelegate;

/**
 * 业务代表
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();    //查询服务
    private BusinessService businessService;    //业务服务
    private String serviceType; //服务类型

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){   //做任务
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
