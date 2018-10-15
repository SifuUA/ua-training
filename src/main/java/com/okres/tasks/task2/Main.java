package com.okres.tasks.task2;

import com.okres.tasks.task3.Model.Entity;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.gamePreparation();
    }
}
