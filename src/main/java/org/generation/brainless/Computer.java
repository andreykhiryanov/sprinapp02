package org.generation.brainless;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private int id;
    private RockMusicPlayer rockMusicPlayer;

    @Autowired
    public Computer(RockMusicPlayer rockMusicPlayer) {
        this.rockMusicPlayer = rockMusicPlayer;
        id = 1;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + rockMusicPlayer.playSong();
    }
}