package com.dazhi6.structuralMode.adapter;

/**
 * Created by Administrator on 2018/8/16.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4 file name : "+fileName);
    }
}
