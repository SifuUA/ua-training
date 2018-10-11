package com.okres.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Controller {

    public static final int MIN_RANGE_VALUE = 0;
    public static final int MAX_RANGE_VALUE = 1;
    public static final String SMALLER = "Smaller";
    public static final String BIGGER = "Bigger";
    public static final String WIN = "Win";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

    }

    public void gamePreparation() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        model.setCurrentRange(new int[]{0, 100});
        model.setNumber((int) (Math.random() * 100));
        model.setPreviousAnswers(new ArrayList<>());
        view.userGreeting();
        gameRunner(br);
    }

    private void gameRunner(BufferedReader br) {
        String tmp;

        try {
            while ((tmp = br.readLine()) != null) {
                view.showCurrentRange(model.getCurrentRange());
                workWithData(tmp);
                view.showAllAttempts(model.getPreviousAnswers());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void workWithData(String tmp) {
        int i;

        if (isNumber(tmp)) {
            i = Integer.parseInt(tmp);
            if (i > model.getCurrentRange()[MIN_RANGE_VALUE] && i < model.getCurrentRange()[MAX_RANGE_VALUE]) {
                if (i > model.getNumber())
                    view.printResult(BIGGER);
                else if (i < model.getNumber())
                    view.printResult(SMALLER);
                else {
                    view.printResult(WIN);
                    System.exit(1);
                }
                model.getPreviousAnswers().add(i);
            }
        }
    }

    private boolean isNumber(String str) {
        try {
            int i = Integer.parseInt(str);
        } catch (Exception e) {
            view.wrongInput();
            return false;
        }
        return true;
    }
}
