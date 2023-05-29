package com.constructor;

public class Student3 {
                           // Creating Parameterized Constructor

    private int roll;
    private String name;
    private double per;



    public Student3(int r,String s ,double p){

        roll = r;
        name = s;
        per = p;

    }
    public void show()
    {
        System.out.println("Name = "+name+", roll = "+roll+ ", percentage = "+per);
    }



}
