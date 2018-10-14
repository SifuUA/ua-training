package com.okres.tasks.task3.Controller;

import com.okres.tasks.task3.Model.Model;
import com.okres.tasks.task3.View.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String tmp = sc.nextLine();
            System.out.println(tmp);
        }
    }
}
