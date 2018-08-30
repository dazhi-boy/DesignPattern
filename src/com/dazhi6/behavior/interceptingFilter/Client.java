package com.dazhi6.behavior.interceptingFilter;

/**
 * Created by Administrator on 2018/8/29.
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
