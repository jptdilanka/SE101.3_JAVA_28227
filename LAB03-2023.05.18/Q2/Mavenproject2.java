package com.mycompany.mavenproject2;
public class Mavenproject2
{
    public static void main(String[] args) 
    {
        Employee e1=new Employee(10000f);
        e1.setName("Thanuji");
        e1.setSalary(50000f);
        System.out.println("Amount salary: "+e1.amount());
        e1.display();
    }
}
