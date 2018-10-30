package com.okres.task6;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List <ElectricityConsumer> electricityConsumerList = new ArrayList<>();


    public void switchOn() {
        System.out.println("Вимикач ввімкнений");
        if (electricityConsumer != null)
            electricityConsumer.electricityOn();
    }
}
