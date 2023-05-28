package com.constructor;

public class Student2 {
    private int roll;
    private String name;
    private double per;

//                                    INITIALIZING OBJECTS USING CONSTRUCTOR
    public Student2(){
        System.out.println("Object Created");
        roll = 10;
        name = "Vikas";
        per = 67.8;
    }

    public void show(){
        System.out.println("Name = "+name+", roll = "+roll+ ", percentage = "+per);
    }


}
