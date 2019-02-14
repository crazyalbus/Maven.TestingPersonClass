package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private char gender;
    private String hairColor;
    private String eyeColor;
    private char maritalStatus;
    private Boolean isAlive;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
        gender = 'U';
        hairColor = "";
        eyeColor = "";
        maritalStatus = 'S';
        isAlive = true;

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, char gender, String hairColor, String eyeColor, char maritalStatus, Boolean isAlive) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.maritalStatus = maritalStatus;
        this.isAlive = isAlive;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setMaritalStatus(char maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public char getMaritalStatus() {
        return maritalStatus;
    }

    public Boolean getAlive() {
        return isAlive;
    }
}


