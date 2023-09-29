package com.company;

public class Triangle {
    public Double a;
    public Double b;
    public Double c;

    public double area(){
        double p = (a + b + c)/2.0;
        double areaT = Math.sqrt(p * (p-a) * (p - b) * (p - c));
        return areaT;
    }
}
