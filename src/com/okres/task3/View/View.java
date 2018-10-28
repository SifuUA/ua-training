package com.okres.task3.View;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.okres.task3.View.TextInfo.INPUT;
import static com.okres.task3.View.TextInfo.WRONG_INPUT;

public class View {
    private static final String RESOURCE_BUNDLE_NAME = "resources";

    public static ResourceBundle resourceBundle =
            ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME,
                    //new Locale("ua", "UA"));
                    new Locale("en", "US"));

    public void pringStringInput(String message) {
        printMessage(concatString(resourceBundle.getString(INPUT), resourceBundle.getString(message)));
    }

    public void printMessage(String str) {
        System.out.println(str);
    }

    private String concatString(String ... str) {
        StringBuilder sb = new StringBuilder();
        for(String s : str) {
            sb.append(s);
        }
        return new String(sb);
    }

    public void printWrongInput(String message) {
        printMessage(concatString(
                resourceBundle.getString(WRONG_INPUT),
                resourceBundle.getString(INPUT),
                resourceBundle.getString(message)
        ));
    }
}
