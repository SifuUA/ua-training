package com.okres.task3.Model.entity;

public class NotUniqueException extends Exception {

    private String info;

    public NotUniqueException(String message, String info) {
        super(message);
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
