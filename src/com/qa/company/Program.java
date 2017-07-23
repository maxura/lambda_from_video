package com.qa.company;

import static java.lang.System.out;

public class Program {

    public static void fire (Object sender){
        out.println("Fire");
    }

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        //sw.addElectricityListener(lamp);
        //sw.addElectricityListener(radio);
        //sw.addElectricityListener(Ob  -> System.out.println("Fire"));
        //sw.addElectricityListener((Object a) -> System.out.println("Fire"));
        sw.addElectricityListener(Program::fire);


        sw.switchOn();



    }
}
