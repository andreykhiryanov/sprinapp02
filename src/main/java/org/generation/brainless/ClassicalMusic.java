package org.generation.brainless;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public String getSong() {
        return "Hungarian Rhapsody";
    }

}