package ru.maxima.radio;

import java.util.List;

public class RadioList {
    List<String> songs;

    public RadioList() {
    }

    public RadioList(List<String> songs) {
        this.songs = songs;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
