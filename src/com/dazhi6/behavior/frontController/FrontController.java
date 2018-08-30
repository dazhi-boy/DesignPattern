package com.dazhi6.behavior.frontController;

/**
 * Created by Administrator on 2018/8/29.
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){  //认证用户
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request){  //跟踪请求
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request){    //调度请求
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
