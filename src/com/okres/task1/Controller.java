package com.okres.task1;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void workWithUser() {
        Scanner scanner = new Scanner(System.in);
        view.printMessageToUser(View.GREETING);
        model.setFirstWord(getWord(scanner, View.FIRST_WORD));
        model.setSecondWord(getWord(scanner, View.SECOND_WORD));
        view.printMessageToUser(model.getFirstWord() + " " + model.getSecondWord() + "!!!");
    }

    public String getWord(Scanner scanner, int word) {
        String tmp;

        while (scanner.hasNext()) {
            tmp = scanner.next();
            tmp = tmp.trim();
            if (tmp.equalsIgnoreCase(View.FIRST_SAMPLE) && word == View.FIRST_WORD) {
                view.printMessageToUser(View.CORRECT_FIRST_WORD);
                return tmp;
            } else if (tmp.equalsIgnoreCase(View.SECOND_SAMPLE) && word == View.SECOND_WORD) {
                view.printMessageToUser(View.CORRECT_SECOND_WORD);
                return tmp;
            } else
                view.printMessageToUser(View.WRONG_INPUT_DATA);
        }
        return null;
    }
}
