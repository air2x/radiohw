package ru.maxima.radio;

public class RetroRadio implements Music {

    private Music music;

    public RetroRadio(Music music) {
        this.music = music;
    }

    @Override
    public void playSong() {

    }
}
