package com.okres.task3.View;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.okres.task3.View.ConstantToResourceBundle.INPUT_STRING_DATA;

public class View {

    static String BUNDLE_NAME = "messages";

    public static final ResourceBundle bundle = ResourceBundle.
            getBundle(BUNDLE_NAME, new Locale("ua", "UA"));



    public void printMessage(String message) {
        System.out.println(message);
    }

    public String collectAllString(String... str) {
        StringBuilder sb = new StringBuilder();
        for (String i : str) {
            sb = sb.append(i);
        }
        return new String(sb);
    }

    public void printBondleMessage(String firstName) {
        printMessage(collectAllString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(firstName)
        ));
    }
}
