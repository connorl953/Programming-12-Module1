package com.connor.module13;

public abstract class TwoDShape {
     double width;
     double height;

    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public TwoDShape(){
        this.width = 0;
        this.height = 0;
    }

    public double getArea(){
        return width * height;
    }

    public void setHeight(double height){
        this.height = height;
    }
}
