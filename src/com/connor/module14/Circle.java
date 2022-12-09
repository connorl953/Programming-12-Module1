package com.connor.module14;

public class Circle extends TwoDShape{
    public final double PI = Math.PI;
    private double radius;


    /**
     * Constructor for Circle objects
     * @param radius the radius of the circle
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle
     * @return the area of the circle
     */
    public double getArea(){
        return PI * Math.pow(radius, 2);
    }

    /**
     * Returns a string representation of the circle
     * @return a string representation of the circle
     */
    public String toString(){
        return "This is a circle with a radius of " + radius + " and an area of " + getArea() + ". It is coloured " + colour;
    }
}
