package com.company;

public class PeopleData {
    private char sex;
    private double height;

    public PeopleData(char sex, double height){
        this.sex = sex;
        this.height = height;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
