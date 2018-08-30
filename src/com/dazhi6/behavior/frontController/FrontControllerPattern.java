package com.dazhi6.behavior.frontController;

/**
 * Created by Administrator on 2018/8/29.
 */
public class FrontControllerPattern {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
