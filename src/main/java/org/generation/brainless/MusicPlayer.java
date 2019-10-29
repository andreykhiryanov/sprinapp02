package org.generation.brainless;

import java.util.ArrayList;
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
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    private void initialization() {
        System.out.println("Initialization!");
    }

    private void destruction() {
        System.out.println("Destruction!");
    }

}