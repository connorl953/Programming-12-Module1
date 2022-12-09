package com.connor.module14;


public class Triangle extends TwoDShape implements Rotate {
     double side1; //side "A"
     double side2; //side "B"
     double side3; //side "C"
     double rotation = 0;

    /**
     * Constructor for Triangle with width and height
     * @param width the length of the base of the triangle
     * @param height the height of the triangle
     */
    public Triangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    /**
     * Constructor for Triangle with side lengths
     * @param side1 the length of side "A" of the triangle
     * @param side2 the length of side "B" of the triangle
     * @param side3 the length of side "C" of the triangle
     */
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1; // Left side of triangle
        this.side2 = side2; // Bottom part of triangle
        this.side3 = side3; // Right side of triangle
        this.width = side2;
        this.height = heronsHeight();
    }
    /**
     * Calculates the height of the triangle using Heron's Formula
     * @return the height of the triangle
     */
    private double heronsHeight() {
        double S = (side1 + side2 + side3)/2;
        double area = Math.sqrt(S * (S-side1) * (S-side2) * (S-side3));
        return (2 * area)/side2;
    }

    /**
     * Calculates the area of the triangle
     * @return the area of the triangle
     */
    public double getArea(){
        return (0.5 * (width * height));
    }

    /**
     * Returns a double representation of the height of the triangle
     * @return the height of the triangle
     */
    public double getHeight(){
        return this.height;
    }

    /**
     * Returns a string representation of the Triangle
     * @return a string representation of the Triangle
     */
    public String toString(){
        return "This is a triangle with width: " + width + " and height: " + height + " and it is rotated " + rotation + " degrees. It is coloured " + colour;
    }

    /**
     * Rotates the triangle 90 degrees
     */
    @Override
    public void rotate90() {
        this.rotation += 90;
    }

    /**
     * Rotates the triangle 180 degrees
     */
    @Override
    public void rotate180() {
        this.rotation += 180;
    }

    /**
     * Rotates the triangle by a given degree
     * @param degree the degree to rotate the triangle by
     */
    @Override
    public void rotate(double degree) {
        this.rotation += degree;
    }
}
