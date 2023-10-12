package com.company.Randomcode;

public class Student {

    public String name;
    public Double nota1;
    public Double nota2;
    public Double nota3;

    public double allNotas(){
        return  (nota1  + nota2  + nota3 );
    }
    public double pointsResult(){
        if(allNotas() < 60.0){
            return 60.0 - allNotas();
        }else {
            return 0.0;
        }
    }
}
