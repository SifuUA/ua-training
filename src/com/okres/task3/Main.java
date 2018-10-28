package com.okres.task3;

import com.okres.task3.Controller.Controller;
import com.okres.task3.Model.Model;
import com.okres.task3.View.View;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*Locale [] locales = Locale.getAvailableLocales();
        *//*for (Locale i : locales)
        System.out.println(i);*//*
        System.out.println(Locale.getDefault());
        System.out.println(
                new String(View.resourceBundle.getString("input.string.data").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
*/
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
