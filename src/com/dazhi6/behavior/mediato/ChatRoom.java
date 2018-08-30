package com.dazhi6.behavior.mediato;

import java.util.Date;

/**
 * 中介者模式
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
