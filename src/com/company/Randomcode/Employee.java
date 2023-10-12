package com.company.Randomcode;

public class Employee {
    public String name;
    public Double grossSalary;
    public Double tax;

    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage){
        double total = (grossSalary * (percentage / 100.00));
        this.grossSalary += total;
    }

    @Override
    public String toString() {
        return "Employee" +
                "name='" + name + '\'' +
                ", grossSalary=" + grossSalary +
                ", tax=" + tax
                ;
    }
}
