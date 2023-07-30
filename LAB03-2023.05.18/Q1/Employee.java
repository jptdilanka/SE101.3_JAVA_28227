package com.mycompany.test;
public class Employee 
{
    private String name;
    private int age;
    private float salary;
    public Employee(String name,int age,float salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String GetName()
    {
        return name;
    }
    public int GetAge()
    {
        return age;
    }
    public float GetSalary()
    {
        return salary;
    }
}
