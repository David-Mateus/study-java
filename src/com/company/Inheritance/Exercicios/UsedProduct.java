package com.company.Inheritance.Exercicios;

import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends  Product {
    private String manufactureDate;
    public UsedProduct(){}

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }



    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag(){
        return null;
    }
}
