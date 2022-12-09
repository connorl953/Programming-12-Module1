package com.connor.module11;

public class Triangle extends TwoDShape{
    double side1; //side "A"
    double side2; //side "B"
    double side3; //side "C"

    public Triangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1; // Left side of triangle
        this.side2 = side2; // Bottom part of triangle
        this.side3 = side3; // Right side of triangle
        this.width = side2;
        this.height = heronsHeight();
    }

    private double heronsHeight() {
        double S = (side1 + side2 + side3)/2;
        double area = Math.sqrt(S * (S-side1) * (S-side2) * (S-side3));
        return (2 * area)/side2;
    }

    public double getArea(){
        return (0.5 * (width * height));
    }

}
