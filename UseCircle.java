package com.oops;
import java.util.Scanner;
public class UseCircle {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        r = sc.nextInt();
        circle obj = new circle();
        obj.setRadius(r);
        obj.calculateArea();
        obj.calculateCircumference();
    }
}
