package com.mycompany.test;
public class Employee 
{
    private int empID;
    private String empName;
    private String empDesignation;
    public void setID(int empID)
    {
        this.empID=empID;
    }
    public void setName(String empName)
    {
        this.empName=empName;
    }
    public void setDesignation(String empDesignation)
    {
        this.empDesignation=empDesignation;
    }
    public int getID()
    {
        return empID;
    }
    public String getName()
    {
        return empName;
    }
    public String getDesignation()
    {
        return empDesignation;
    }
}
