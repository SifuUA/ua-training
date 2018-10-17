package com.okres.task3.Controller;

import com.okres.task3.View.View;

import java.util.Scanner;

import static com.okres.task3.View.ConstantToResourceBundle.WRONG_INPUT;

public class UtilityController {

   private View view;
   private Scanner sc;

    public UtilityController(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public String inputStringValue(String firstName, String regex) {
        String res;
        view.printBondleMessage(firstName);
        while (!(sc.hasNext() && (res = sc.next()).matches(regex))) {
            view.printMessage(WRONG_INPUT);
        }
        return res;
    }
}
