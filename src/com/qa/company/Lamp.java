package com.qa.company;

/**
 * Created by mmusiienko on 7/10/17.
 */
public class Lamp implements ElectricityConsumer{
    public void lightOn(){
        System.out.println("Lamp is lighted");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
