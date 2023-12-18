package ru.maxima.radio;

public class KidsRadio implements Music{

    private Music music;

    public KidsRadio(Music music) {
        this.music = music;
    }

    @Override
    public void playSong() {

    }
}
