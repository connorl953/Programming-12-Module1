package com.connor;
import com.connor.module13.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> shapes = new ArrayList<>();

        shapes.add(new Triangle(10.0, 20.0));
        shapes.add(new Circle(5.0));
        shapes.add(new Triangle(9.0, 10.0, 11.0));
        shapes.add(new Circle(12.0));
        for(TwoDShape shape : shapes){
            System.out.println(shape.toString());
        }

    }
}
