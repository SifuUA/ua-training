package com.okres.tasks.task3.Controller;

import com.okres.tasks.task3.Model.Entity;
import com.okres.tasks.task3.Model.Model;
import com.okres.tasks.task3.View.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private Entity entity;

    public Controller(Model model, View view, Entity entity) {
        this.model = model;
        this.view = view;
        this.entity = entity;
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        view.printMessage(View.GREETING);
        while (sc.hasNext()) {
            String tmp = sc.nextLine();
            int flag = 0;

            if (model.check(tmp, flag)) {
                System.out.println("URRA!");
                flag++;
            }
            else {
                System.out.println("WRONG!");
            }
        }
    }
}
