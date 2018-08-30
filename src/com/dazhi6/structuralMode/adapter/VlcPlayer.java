package com.dazhi6.structuralMode.adapter;

/**
 * Created by Administrator on 2018/8/16.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("play vlc file name : "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
