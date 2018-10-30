package com.okres.task6;

public class Main {
    public static void main(String[] args) {

/*    int res = sum(3);
        System.out.println(res);

    }

    static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);*/

    Switcher switcher = new Switcher();
    Lamp lamp = new Lamp();

    switcher.electricityConsumer = lamp;
    switcher.switchOn();
    }
}
