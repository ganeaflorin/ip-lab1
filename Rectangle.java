package com.company;
//mostenire+interfata
public class Rectangle extends Shape implements Perimeter{
    private double height;
    private double width;

    Rectangle () {
        height = 0;
        width = 0;
    }
    public Rectangle setHeight (double height)
    {
        this.height = height;
        return this;
    }
    public Rectangle setWidth (double width)
    {
        this.width = width;
        return this;
    }
    public void onAreaChange() {
        this.area = width * height;
    }
    public double getPerimeter() {
        return 2*(height+width);
    }
}
