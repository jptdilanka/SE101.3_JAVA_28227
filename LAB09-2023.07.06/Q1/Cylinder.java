package com.mycompany.mavenproject4;
public class Cylinder {

    public static void main(String[] args) {
        
        double radius = 2.5; 
        double height = 5.0; 

        CylindricalContainer cylinder = new CylindricalContainer(radius, height);
        double volume = cylinder.volume();

        System.out.println("Volume of the CylindricalContainer: " + volume);
    
    }
}
