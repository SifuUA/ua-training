package com.okres.task3.Controller;

import com.okres.task3.Model.Entity;
import com.okres.task3.View.View;

import java.util.Scanner;

import static com.okres.task3.View.ConstantToResourceBundle.FIRST_NAME;

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
                ? RegularExpressions.FIRST_NAME_UKR : RegularExpressions.FIRST_NAME_EN;

        this.entity.setFirstName(uc.inputStringValue(FIRST_NAME, str));
    }
}
