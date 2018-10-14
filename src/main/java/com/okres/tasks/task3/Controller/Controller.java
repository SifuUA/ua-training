package com.okres.tasks.task3.Controller;

import com.okres.tasks.task3.Model.Model;
import com.okres.tasks.task3.View.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        System.out.println("AAA");
    }
}
