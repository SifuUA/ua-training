package com.okres.task6;

public class Radio implements ElectricityConsumer {

    @Override
    public void electricityOn() {
        paly();
    }

    public void paly() {
        System.out.println("Радіо грає!");
    }
}
