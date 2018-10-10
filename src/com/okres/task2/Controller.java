package com.okres.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

    }

    public void gamePreparation() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        view.userGreeting();
        model.setCurrentRange(new int[]{0, 100});
        model.setNumber((int) (Math.random() * 100));
        gameRunner(br);
    }

    private void gameRunner(BufferedReader br) {
        String tmp;

        try {
            while ((tmp = br.readLine()) != null) {
                view.showCurrentRange(model.getCurrentRange());

                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
