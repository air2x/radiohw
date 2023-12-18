package ru.maxima.radio;

public class EnergyRadio implements Music {
    private String song;

    public EnergyRadio(String song) {
        this.song = song;
    }

    @Override

    public void playSong() {
        System.out.println(song);
    }
}
