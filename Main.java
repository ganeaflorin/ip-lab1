package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle dreptunghi = new Rectangle();
        Triangle triunghi = new Triangle();
        Circle cerc = new Circle();
        dreptunghi.setHeight(3.5);
        dreptunghi.setWidth(4);
        dreptunghi.onAreaChange();
        double x = dreptunghi.getArea();
        double y = dreptunghi.getPerimeter();
        System.out.println("arie: " + x + "\n" + "perimetru: " + y);
        int a = cerc.getDiameter(4);
        double b = cerc.getDiameter(4.5);
        System.out.println("diametru1: " + a + " diametru2: " + b + "\n");
        int c = triunghi.getNoSides();
        System.out.println("Numar laturi: " + c);
    }
}
