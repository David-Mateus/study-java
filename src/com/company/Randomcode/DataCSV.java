package com.company.Randomcode;

public class DataCSV {
    private String name;
    private Double price;
    private Double qtd;

    public DataCSV(String name, Double price, Double qtd) {
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQtd() {
        return qtd;
    }

    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }
}
