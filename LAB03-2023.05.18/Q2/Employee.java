package com.mycompany.mavenproject2;
public class Employee
{
    private String name;
    private float salary,bonus,a;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSalary(float salary)
    {
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public float getSalary()
    {
        return salary;
    }
    public Employee(float bonus)
    {
        this.bonus=bonus;
    }
    public float amount()
    {
        a=salary+bonus;
        return a;
    }
    public void display()
    {
        System.out.println("Employee name: "+name);
        System.out.println("Amount salary: "+a);
    }
}
