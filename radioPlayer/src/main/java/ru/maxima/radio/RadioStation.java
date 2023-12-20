package ru.maxima.radio;

import java.util.List;
import java.util.Random;

public class RadioStation {
    private List<String> songs;

    public RadioStation() {
    }

    public RadioStation(List<String> songs) {
        this.songs = songs;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    public void playRandomSong() {
        Random random = new Random();
        System.out.println(songs.get(random.nextInt(songs.size())));
    }
}
