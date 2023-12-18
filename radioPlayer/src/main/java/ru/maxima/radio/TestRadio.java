package ru.maxima.radio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRadio {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("energyRadio", EnergyRadio.class);
        RadioPlayer radioPlayer = new RadioPlayer(music);
        radioPlayer.playRadio();

    }
}
