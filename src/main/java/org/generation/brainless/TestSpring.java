package org.generation.brainless;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer otherMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer == otherMusicPlayer);

        musicPlayer.playMusic();

        context.close();

    }

}