package ru.maxima.radio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRadio {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        RadioList radioList = context.getBean("radioList", RadioList.class);
        RadioPlayer radioPlayer = new RadioPlayer(radioList.getRadioStations());
        radioPlayer.playRadio();

    }
}
