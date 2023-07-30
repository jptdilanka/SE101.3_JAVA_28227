package com.mycompany.shapeobj;
public class Shapeobj 
{
    public static void main(String[] args) 
    {
        Circle c1=new Circle(7.7);
        System.out.println("Area of Circle: "+c1.calculateArea());
        System.out.println("Perimeter of Circle: "+c1.calculatePerimeter());
        
        Rectangle r1=new Rectangle(12.5,34.98);
        System.out.println("Area Rectangle: "+r1.calculateArea());
        System.out.println("Perimeter Rectangle: "+r1.calculatePerimeter());
        
        Traingle t1=new Traingle(12.3,23.5,34.3,45.56);
        System.out.println("Area Traingle: "+t1.calculateArea());
        System.out.println("Perimeter Traingle: "+t1.calculatePerimeter());
    }
    
}
