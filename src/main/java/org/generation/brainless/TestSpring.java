package org.generation.brainless;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // Playing all music in list.

        System.out.println("Name: " + firstMusicPlayer.getName() + ".");
        System.out.println("Volume: " + firstMusicPlayer.getValue() + ".");
        firstMusicPlayer.playMusic();

        System.out.println();

        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        // Another bean of class MusicPlayer, but with the same properties.
        System.out.println("Name: " + firstMusicPlayer.getName() + ".");
        System.out.println("Volume: " + firstMusicPlayer.getValue() + ".");
        secondMusicPlayer.playMusic();

        System.out.println();

        System.out.print("Are objects of these two players the same? It is ");
        System.out.println((firstMusicPlayer == secondMusicPlayer) + "!");

        System.out.println();

        // This is another bean of the other class OneSongPlayer.
        // It's seems, that we can get access to this class from context without pointing on name of the class,
        // but casting result of getBean method to player's class.

        RockMusicPlayer thirdMusicPlayer = (RockMusicPlayer) context.getBean("rockMusicPlayer");
        System.out.println("Name: " + thirdMusicPlayer.getName() + ".");
        System.out.println("Volume: " + thirdMusicPlayer.getValue() + ".");
        System.out.println(thirdMusicPlayer.playSong());

        System.out.println();

        // The argument "Computer.class" in method getBean is a usage of Java Reflexion API.
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();

    }

}