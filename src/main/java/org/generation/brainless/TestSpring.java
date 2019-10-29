package org.generation.brainless;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // Playing all music in list.
        firstMusicPlayer.playMusic();

        System.out.println("Name: " + firstMusicPlayer.getName() + ".");
        System.out.println("Volume: " + firstMusicPlayer.getValue() + ".");

        System.out.println();

        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        secondMusicPlayer.playMusic();

        System.out.println("Name: " + firstMusicPlayer.getName() + ".");
        System.out.println("Volume: " + firstMusicPlayer.getValue() + ".");

        System.out.println();

        // Objects are different.
        System.out.println(firstMusicPlayer == secondMusicPlayer);

        context.close();

    }

}