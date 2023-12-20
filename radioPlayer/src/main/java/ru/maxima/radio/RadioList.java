package ru.maxima.radio;

import java.util.List;

public class RadioList {
    List<RadioStation> radioStations;

    public RadioList() {
    }

    public RadioList(List<RadioStation> songs) {
        this.radioStations = songs;
    }

    public List<RadioStation> getRadioStations() {
        return radioStations;
    }

    public void setRadioStations(List<RadioStation> radioStations) {
        this.radioStations = radioStations;
    }
}
