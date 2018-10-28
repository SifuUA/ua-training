package com.okres.task3.Model.entity;

public class NoteBook {
    private String name;
    private String login;

    public NoteBook(String name, String login) throws NotUniqueException {
        if (DbImitation.checkLogin(login)) {
            throw new NotUniqueException("Login is not unique", login);
        }
        this.name = name;
        this.login = login;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
