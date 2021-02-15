package com.company;

public class Circle extends Shape {
    private double radius;
    private double pi = 3.14;

    public Circle() {
        radius = 0;
    }
    public Circle setRadius (double radius) {
        this.radius = radius;
        return this;
    }
    public void onAreaChange () {
        this.area = pi * Math.pow(radius, 2);
    }

    //static polimorfism
    public double getDiameter(double radius) {
        return 2*radius;
    }
    public int getDiameter(int radius) {
        return 2*radius;
    }

}
