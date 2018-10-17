package com.okres.task3.Controller;

import com.okres.task3.Model.Entity;
import com.okres.task3.View.View;

import java.util.Scanner;

public class Controller {
    private View view;
    private Entity entity;

    public Controller(View view, Entity entity) {
        this.view = view;
        this.entity = entity;
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        InputNoteToNoteBook ip = new InputNoteToNoteBook(view, sc);
        ip.insertNote();
    }
}
