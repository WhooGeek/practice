package com.whoo.chap08;

public class Triangle extends Shape implements Resizable{

    @Override
    public void resize(double factor) {
        base = factor * base;
        height = factor * height;
        side1 = factor * side1;
        side2 = factor * side2;
        side3 = factor * side3;

    }

    public double base;
    public double height;
    public double side1;
    public double side2;
    public double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    @Override
    double calculateArea() {
        return base * height * 0.5;
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
