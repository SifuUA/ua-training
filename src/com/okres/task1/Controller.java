package com.okres.task1;
import java.util.Scanner;


public class Controller {

    private static final int FIRST_WORD = 1;
    private static final int SECOND_WORD  = 2;
    private static final String FIRST_SAMPLE = "Hello";
    private static final String Second_SAMPLE = "world";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void workWithUser() {
        Scanner scanner = new Scanner(System.in);
        view.printMessageToUser("Hello, I am wait from you 2 words one by one \"Hello\" than " +
                "press enter and than \"world\"");
        model.setFirstWord(getWord(scanner, FIRST_WORD));
        model.setSecondWord(getWord(scanner, SECOND_WORD));
        view.printMessageToUser(model.getFirstWord() + " " + model.getSecondWord() + "!!!");
    }

    public String getWord(Scanner scanner, int word) {
        String tmp;

        while (scanner.hasNext()) {
            tmp = scanner.next();
            tmp = tmp.trim();
            if (tmp.equalsIgnoreCase(FIRST_SAMPLE) && word == FIRST_WORD) {
                view.printMessageToUser("You had inputted correct word, wait for second word...");
                return tmp;
            }else if (tmp.equalsIgnoreCase(Second_SAMPLE) && word == SECOND_WORD) {
                view.printMessageToUser("Good job! All correct! Enjoy by results! :)");
                return tmp;
            }
            else
                view.printMessageToUser(View.WRONG_INPUT_DATA);
        }
        return null;
    }
}
