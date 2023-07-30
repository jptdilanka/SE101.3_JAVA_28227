package com.mycompany.mavenproject4;
public class CylindricalContainer extends Container{
    public CylindricalContainer(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        double pi = 3.14159;
        return pi * radius * radius * height;
    }
}
