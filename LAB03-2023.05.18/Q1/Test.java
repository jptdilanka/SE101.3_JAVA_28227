package com.mycompany.test;
public class Test 
{
    public static void main(String[] args) 
    {
        Employee e1=new Employee("Thanuji",23,100000f);
        System.out.println("Your name: "+e1.GetName());
        System.out.println("Your age: "+e1.GetAge());
        System.out.println("Your salary: "+e1.GetSalary());
    }
}
