package org.generation.brainless;

public class SinglePlayer {

    private static SinglePlayer player;

    public SinglePlayer() {
        player = new SinglePlayer();
    }

    public static SinglePlayer getPlayer() {
        return player;
    }

}