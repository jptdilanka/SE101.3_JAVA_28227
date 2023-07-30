package com.mycompany.shapeobj;
public class Traingle implements Shape
{
    private double a,base,c,d;
    public Traingle(double a,double b,double c,double d) 
    {
        this.a = a;
        this.base=b;
        this.c=c;
        this.d=d;
    }
    public double geta() {
        return a;
    }
    public double getb() {
        return base;
    }
    public double getc() {
        return c;
    }
    public double getd() {
        return d;
    }
    public void seta(double a) {
        this.a = a;
    }
    public void setb(double b) {
        this.base = b;
    }
    public void setc(double c) {
        this.c = c;
    }
    public void setd(double d) {
        this.d = d;
    }
    public double calculateArea()
    {
        return 0.5*base*d;
    }
    public double calculatePerimeter()
    {
        return a+base+c;
    }
}
