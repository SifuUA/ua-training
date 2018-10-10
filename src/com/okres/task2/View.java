package com.okres.task2;

public class View {
    public static final String HI = "Welcome to the Game, number which you must guess is generate ...";

    public void userGreeting() {
        System.out.println(HI);
        System.out.println(String.format("Ready! \nPlease input number between 0 and 100"));

    }

    public void showCurrentRange(int[] range) {
        System.out.println(String.format("Current range: %d to %d", range[0], range[1]));
    }

    public void wrongInput() {
        System.err.println("Wrong input, program support only numeric input");
    }
}
