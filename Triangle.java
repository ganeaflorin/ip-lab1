package com.company;

public class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle () {
        base = 0;
        height = 0;
    }
    public Triangle setBase (double base) {
        this.base = base;
        return this;
    }
    public Triangle setHeight (double height) {
        this.height = height;
        return this;
    }
    public void onAreaChange ()
    {
        this.area = base*height/2;
    }
    //dinamic polimorfism
    @Override public int getNoSides() {
        return 3;
    }
}
