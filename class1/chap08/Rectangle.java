package com.whoo.chap08;

public class Rectangle extends Shape implements Resizable{

    public double width ;
    public double height ;

    @Override
    public void resize(double factor) {
        width = factor * width;
        height = factor * height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        return 4*width;
    }

    @Override
    double calculateArea() {
        return width*height;
    }
}
