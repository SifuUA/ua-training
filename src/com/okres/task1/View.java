package com.okres.task1;

public class View {

    public static final int FIRST_WORD = 1;
    public static final int SECOND_WORD = 2;
    public static final String FIRST_SAMPLE = "Hello";
    public static final String SECOND_SAMPLE = "world";
    public static final String GREETING = "Hello, I am wait from you 2 words one by one \"Hello\" than " +
            "press enter and than \"world\"";
    public static final String CORRECT_FIRST_WORD = "You had inputted correct word, wait for second word...";
    public static final String CORRECT_SECOND_WORD = "Good job! All correct! Enjoy by results! :)";

    public static final String WRONG_INPUT_DATA = "You have mistake, please try again ...";

    public void printMessageToUser(String message) {
        System.out.println(message);
    }
}
