package ru.maxima.radio;

public class NewsRadio implements Music {

    private Music music;

    public NewsRadio(Music music) {
        this.music = music;
    }

    @Override
    public void playSong() {

    }
}
