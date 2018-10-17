package java.com.okres.tasks.task3.Controller;

import java.com.okres.tasks.task3.Model.Entity;
import java.com.okres.tasks.task3.View.View;
import java.util.Scanner;

import static java.com.okres.tasks.task3.Controller.RegularExpressions.FIRST_NAME_EN;
import static java.com.okres.tasks.task3.Controller.RegularExpressions.FIRST_NAME_UKR;

public class InputNoteToNoteBook {

    private View view;
    private Scanner sc;
    private Entity entity;

    public InputNoteToNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }


    public void insertNote() {
        UtilityController uc = new UtilityController(view, sc);
        String str = String.valueOf(View.bundle.getLocale()).equals("ua")
                ? FIRST_NAME_UKR : FIRST_NAME_EN;
        entity.setFirstName(str);
    }
}
