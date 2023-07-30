package com.mycompany.test;
public class Test {

    public static void main(String[] args) 
    {
        Employee e1=new Employee();
        e1.setID(123);
        e1.setName("Bogdan");
        e1.setDesignation("Gampaha");
        System.out.println("Employee ID: "+e1.getID());
        System.out.println("Employee name: "+e1.getName());
        System.out.println("Employee designation: "+e1.getDesignation());
        
        Employee e2=new Employee();
        e2.setID(456);
        e2.setName("Bird");
        e2.setDesignation("Homagama");
        System.out.println("Employee ID: "+e2.getID());
        System.out.println("Employee name: "+e2.getName());
        System.out.println("Employee designation: "+e2.getDesignation());
    }
}
