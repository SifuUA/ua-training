package java.com.okres.tasks.task3.Controller;

import java.com.okres.tasks.task3.Model.Entity;
import java.com.okres.tasks.task3.Model.Model;
import java.com.okres.tasks.task3.View.View;

import java.util.Scanner;

public class Controller {
    private View view;
    private Entity entity;

    public Controller(Model model, View view, Entity entity) {
        this.view = view;
        this.entity = entity;
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
       InputNoteToNoteBook ip = new InputNoteToNoteBook(entity, view);
    }
}
