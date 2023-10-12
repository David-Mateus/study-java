package com.company.Randomcode;

public class Product {
    public String name;
    public Double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ",Total="+totalValueInStock()
                ;
    }
}
