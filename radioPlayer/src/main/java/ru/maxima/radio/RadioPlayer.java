package ru.maxima.radio;

public class RadioPlayer {

    private Music music;

    public RadioPlayer(Music music) {
        this.music = music;
    }

    public void playRadio() {
        music.playSong();
    }
}
