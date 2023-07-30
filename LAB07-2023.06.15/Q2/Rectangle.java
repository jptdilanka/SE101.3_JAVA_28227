package com.mycompany.shapeobj;
public class Rectangle implements Shape
{
    private double width,height;
    public Rectangle(double width,double height) {
        this.width = width;
        this.height=height;
    }
    public double getwidth() {
        return width;
    }
    public double getheight() {
        return height;
    }
    public void setwidth(double width) {
        this.width = width;
    }
    public void setheight(double height) {
        this.height = height;
    }
    public double calculateArea()
    {
        return width*height;
    }
    public double calculatePerimeter()
    {
        return 2*(width+height);
    }
}
