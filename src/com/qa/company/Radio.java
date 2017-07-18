package com.qa.company;

/**
 * Created by mmusiienko on 7/14/17.
 */
public class Radio implements ElectricityConsumer{
 public void playMusic(){
     System.out.println("Radio plays");
 }
    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
