package org.generation.brainless;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RockMusicPlayer {

    private String name;
    private int value;
    private RockMusic song;

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Autowired
    public RockMusicPlayer(RockMusic song) {
        name = "Rock Music Player";
        value = 120;
        this.song = song;
    }

    public String playSong() {
        return "Playing: " + song.getSong() + ".";
    }

}