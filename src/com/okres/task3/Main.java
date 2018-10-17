package com.okres.task3;

import com.okres.task3.Controller.Controller;
import com.okres.task3.Model.Entity;
import com.okres.task3.View.View;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Entity entity = new Entity();
        Controller controller = new Controller(view, entity);
        controller.startGame();

    }
}
