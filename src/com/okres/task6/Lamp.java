package com.okres.task6;

public class Lamp implements ElectricityConsumer {

    public void lumpOn() {
        System.out.println("Лампа ввімкнена!");
    }

    @Override
    public void electricityOn() {
        lumpOn();
    }
}
