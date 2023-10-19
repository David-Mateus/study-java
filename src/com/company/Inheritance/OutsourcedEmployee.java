package com.company.Inheritance;

public class OutsourcedEmployee extends Employee{
    private  Double additionalCharge;

    // Constructor
    public OutsourcedEmployee(){
        super();
    }
    public OutsourcedEmployee(String name, Integer hour, Double valueHour, Double additionalCharge){
        super(name, hour, valueHour);
        this.additionalCharge = additionalCharge;
    }
    // Getters and Setters

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final Double payment(){
        return  super.payment() + additionalCharge * 1.1;
//        double value = additionalCharge * 1.10;
//        return ((getValueHour() * getHour()) + value);
    }
}
