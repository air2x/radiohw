package ru.maxima.radio;

import java.util.List;
import java.util.Random;

public class RadioPlayer {

    private final List<RadioStation> radioStations;


    public RadioPlayer(List<RadioStation> radios) {
        this.radioStations = radios;
    }

    public void playRadio() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            radioStations.get(random.nextInt(radioStations.size())).playRandomSong();
        }
    }
}
