package com.company.Randomcode;

public class Algortimo {
    public static void main(String[] args) {
        Acc vector = new Acc(5);
        vector.addLastVector("David");
        vector.addLastVector("David");
        vector.addLastVector("David");


        System.out.println(vector.searchElement("David"));
        vector.addLastVector(2);
        System.out.println(vector.toString());
    }
}
