package com.connor.module14;

public abstract class TwoDShape {
     double width;
     double height;
     Colour colour;

    /**
     * Constructor TwoDShape
     *
     * Initializes a TwoDShape object with the given width, height, and colour.
     *
     * @param width The width of the TwoDShape object
     * @param height The height of the TwoDShape object
     * @param colour The colour of the TwoDShape object
     */
    public TwoDShape(double width, double height, Colour colour){
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    /**
     * Constructor TwoDShape
     *
     * Initializes a TwoDShape object with width and height set to 0.
     *
     */
    public TwoDShape(){
        this.width = 0;
        this.height = 0;
    }

    /**
     * getArea
     *
     * Calculates and returns the area of the TwoDShape object.
     *
     * @return The area of the TwoDShape object
     */
    public double getArea(){
        return width * height;
    }

    /**
     * setHeight
     *
     * Sets the height of the TwoDShape object.
     *
     * @param height The new height of the TwoDShape object
     */
    public void setHeight(double height){
        this.height = height;
    }
}
