package com.mycompany.testperson;
public class TestPerson
{
    public static void main(String[] args) 
    {
        Student s1=new Student();
        s1.setName("Thanuji");
        s1.setID(123);
        s1.setCourse("abc");
        System.out.println("Name: "+s1.getName());
        System.out.println("ID: "+s1.getID());
        System.out.println("Course: "+s1.getCourse());
        
        Student l1=new Student();
        l1.setName("Dilanka");
        l1.setID(456);
        l1.setCourse("def");
        System.out.println("Name: "+l1.getID());
        System.out.println("ID: "+l1.getID());
        System.out.println("Course: "+l1.getCourse());
    }
}
