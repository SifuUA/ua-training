package com.okres.task3.Controller;

import com.okres.task3.Model.Model;
import com.okres.task3.View.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        InputNote inputeNote = new InputNote(scanner, view);
        inputeNote.inputeNote();
    }

}
