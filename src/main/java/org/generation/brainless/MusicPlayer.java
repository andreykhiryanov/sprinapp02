package org.generation.brainless;

import java.util.List;

public class MusicPlayer {

    private List<Music> musicList;

    private String name;
    private int value;

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void playMusic() {
        for (Music song : musicList) {
            System.out.println("Playing: " + song.getSong() + ".");
        }
    }

    private void initialization() {
        System.out.println("Bean initialization! You'll see this message once, if scope of musicPlayer bean will be singleton (by default)!");
    }

    private void destruction() {
        System.out.println("Bean destruction! You'll not see this, if scope of musicPlayer bean will be prototype!");
    }

}