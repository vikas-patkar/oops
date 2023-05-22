package com.oops;

public class circle {
    private int radius;
    public void setRadius(int r){
        radius = r;
    }
    public void calculateArea(){
        double ar;
        ar = Math.PI * Math.pow(radius , 2 );
        System.out.println("Area is  "+ ar );
    }
    public void calculateCircumference(){
        double circ;
        circ = 2 * Math.PI * radius;
        System.out.println("Circumference is "+ circ);
    }
}
