package com.okres.tasks.task3;

import com.okres.tasks.task3.Controller.Controller;
import com.okres.tasks.task3.Model.Entity;
import com.okres.tasks.task3.Model.Model;
import com.okres.tasks.task3.View.View;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Entity entity = new Entity();

        Controller controller = new Controller(model, view, entity);

        controller.startGame();

    }
}
