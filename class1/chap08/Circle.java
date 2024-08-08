package com.whoo.chap08;

public class Circle extends Shape implements Resizable {

    public double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;

    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * this.radius;

    }

    @Override
    double calculatePerimeter() {
        return Math.PI * this.radius * this.radius;
    }


}
