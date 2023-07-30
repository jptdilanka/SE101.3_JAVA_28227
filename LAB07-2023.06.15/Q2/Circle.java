package com.mycompany.shapeobj;
class Circle implements Shape
{
    private static final double PI=3.14;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea()
    {
        return PI * radius * radius;
    }
    public double calculatePerimeter()
    {
        return 2 * PI * radius;
    }
}
