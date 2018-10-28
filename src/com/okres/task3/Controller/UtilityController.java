package com.okres.task3.Controller;

import com.okres.task3.View.View;

import java.util.Scanner;

import static com.okres.task3.View.TextInfo.WRONG_INPUT;

public class UtilityController {

    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String inputString(String message, String regex) {
        String res;

        view.pringStringInput(message);
        while (scanner.hasNext()) {
            res = scanner.next();
            if (res.matches(regex))
                break;
            else
                view.printWrongInput(message);
        }
        return null;
    }
}
