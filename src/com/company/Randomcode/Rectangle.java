package com.company.Randomcode;

public class Rectangle {

    public double width;
    public double height;

    public double area(){
        return width * height;
    }
    public double perimeter(){
        double perimeter = (2*width + 2*height);
        return perimeter;
    }
    public double diagonal(){
        double diagonal = Math.sqrt((width*width) + (height*height));
        return diagonal;
    }

    @Override
    public String toString() {
        return "Area= " + area()+
                "Perimeter=" + perimeter() +
                "height=" + diagonal()
                ;
    }
}
