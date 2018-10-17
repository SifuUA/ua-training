package com.okres.task2;

import java.util.List;

public class Model {
    private int number;
    private List<Integer> previousAnswers;
    private int currentRange [];

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Integer> getPreviousAnswers() {
        return previousAnswers;
    }

    public void setPreviousAnswers(List<Integer> previousAnswers) {
        this.previousAnswers = previousAnswers;
    }

    public int[] getCurrentRange() {
        return currentRange;
    }

    public void setCurrentRange(int[] currentRange) {
        this.currentRange = currentRange;
    }
}
