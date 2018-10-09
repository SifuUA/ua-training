package task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void gameRuner() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        model.setNumber((int) (Math.random() * 10));
    }
}
