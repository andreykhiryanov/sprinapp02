package org.generation.brainless;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:musicPlayer.properties")

@Component
public class MusicPlayer {

    private Music song1;
    private Music song2;
    private Music song3;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.value}")
    private int value;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music song1, @Qualifier("popMusic") Music song2, @Qualifier("rockMusic") Music song3) {
        this.song1 = song1;
        this.song2 = song2;
        this.song3 = song3;
    }

    public void playMusic() {
        System.out.println("Name: " + name + ".");
        System.out.println("Value: " + value + ".");
        System.out.println("Playing: " + song1.getSong() + ", " + song2.getSong() + ", " + song3.getSong() + "!");
    }

    private void initialization() {
        System.out.println("Bean initialization! You'll see this message once, if scope of musicPlayer bean will be singleton (by default)!");
    }

    private void destruction() {
        System.out.println("Bean destruction! You'll not see this, if scope of musicPlayer bean will be prototype!");
    }

}