package com.okres.task3.Model.entity;

public enum DbImitation {
    FIRST_NOTE("Ivan","ivan123"),
    SECOND_NOTE("Jack","jack123"),
    THIRD_NOTE("Ron","ron123");

    private final String firstName;
    private final String login;


    DbImitation(String name, String login) {
        this.firstName = name;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public static boolean checkLogin(String login) {
        for (DbImitation i : DbImitation.values()) {
            if (i.getLogin().equals(login))
                return true;
        }
        return false;
    }
}
