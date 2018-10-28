package com.okres.task3.Controller;

import com.okres.task3.View.View;

import java.util.Scanner;

import static com.okres.task3.Controller.RegexContainer.REGEX_LOGIN;
import static com.okres.task3.Controller.RegexContainer.REGEX_NAME_EN;
import static com.okres.task3.Controller.RegexContainer.REGEX_NAME_UKR;
import static com.okres.task3.View.TextInfo.FIRST_NAME;
import static com.okres.task3.View.TextInfo.LOGIN;

public class InputNote {

    private Scanner scanner;
    private View view;

    private String name;
    private String login;

    public InputNote(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public void inputeNote() {
        UtilityController utilityController = new UtilityController(scanner, view);
        String str = String.valueOf(View.resourceBundle.getLocale());
        if (str.equals("ua"))
            str = REGEX_NAME_UKR;
        else
            str = REGEX_NAME_EN;

        this.name = utilityController.inputString(FIRST_NAME, str);
        this.login = utilityController.inputString(LOGIN, REGEX_LOGIN);
    }
}
