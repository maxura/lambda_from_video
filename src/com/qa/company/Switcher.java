package com.qa.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmusiienko on 7/7/17.
 */
public class Switcher {

    private List<ElectricityConsumer> listeners = new ArrayList<>();


    public void addElectricityListener(ElectricityConsumer listener){
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener){
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("Switcher is on");
        if (listeners != null) {
            for (ElectricityConsumer electricityConsumer : listeners) {
                electricityConsumer.electricityOn(this);
            }
        }
    }
}
