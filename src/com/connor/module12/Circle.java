package com.connor.module12;


public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI * Math.pow(radius, 2);
    }

    public String toString(){
        return "This is a circle with a radius of " + radius + " and an area of " + getArea();
    }
}
