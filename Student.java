package com.oops;
import java.util.Scanner;

public class Student {

    private int roll;
    private String name;
    private double per;

    public void setStudent(int r, String str,double p){
        roll = r;
        name = str;
        per = p;

    }
    public void showStudent()
    {
        System.out.println("roll = "+ roll);
        System.out.println("name = "+ name);
        System.out.println("per = "+ per);
    }
}