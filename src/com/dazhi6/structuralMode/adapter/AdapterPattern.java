package com.dazhi6.structuralMode.adapter;

/**
 * 适配器模式
 */
public class AdapterPattern {
    public static void main (String [] str) {
        System.out.println("----- adapter pattern start -----");

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","audioMp3");
        audioPlayer.play("mp4","audioMp4");
        audioPlayer.play("vlc","aduioVlc");
        audioPlayer.play("avi","aduioAvi");

        System.out.println("----- adapter pattern end -----");
    }
}
