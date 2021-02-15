package com.company;

public abstract class Shape {
    public double area;

    Shape() {
        area = 0;
    }

    public double getArea() {
        return this.area;
    }

    public abstract void onAreaChange();
    public int getNoSides() {
        return 4;
    }
}
