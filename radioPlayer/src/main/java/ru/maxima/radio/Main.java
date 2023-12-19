package ru.maxima.radio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

            Music radio = context.getBean("energyRadio", EnergyRadio.class);
            RadioPlayer radioPlayer = new RadioPlayer(radio);
            radioPlayer.playRadio();


    }
}
