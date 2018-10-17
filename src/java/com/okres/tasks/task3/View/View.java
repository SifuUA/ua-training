package java.com.okres.tasks.task3.View;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    public static final String BUNDLE_NAME = "Messages";

    public static final ResourceBundle bundle = ResourceBundle.
            getBundle(BUNDLE_NAME, new Locale("ua", "UA"));

    public void printMessage(String message) {
        System.out.println(message);
    }
}
