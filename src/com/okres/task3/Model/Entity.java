package com.okres.task3.Model;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Entity {
    private String secondName;
    private String firstName;
    private String patronymic;
    private String nickname;
    private String comment;
    private int homePhone;
    private int mobilePhone;
    private String email;
    private String skype;

    public Entity() {
    }

    public Entity(String secondName, String firstName, String patronymic, String nickname, String comment,
                  int homePhone, int mobilePhone, String email, String skype) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.nickname = nickname;
        this.comment = comment;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.skype = skype;
    }


    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(int homePhone) {
        this.homePhone = homePhone;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Field[] getColumnCount() {
        return getClass().getDeclaredFields();
    }

    public HashMap<Integer, String> getAllFields() {
        /*Map<Integer, String> map = new HashMap<>();
        int len = getColumnCount();

        for (int i = 0; i < len; i++) {
            map.put(i, "")
        }*/
        return null;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", homePhone=" + homePhone +
                ", mobilePhone=" + mobilePhone +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                '}';
    }
}