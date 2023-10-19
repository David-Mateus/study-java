package com.company.Inheritance;

public class Employee {
    private String name;
    private Integer hour;
    private Double valueHour;
    //Constructor
    public Employee(){
    }
    public Employee(String name, Integer hour, Double valueHour){
        this.name = name;
        this.hour = hour;
        this.valueHour = valueHour;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double getValueHour() {
        return valueHour;
    }

    public void setValueHour(Double valueHour) {
        this.valueHour = valueHour;
    }

    public Double payment(){
        return valueHour * hour;
    }
}
