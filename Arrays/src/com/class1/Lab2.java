package com.class1;
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        int[]  a=new int[5];
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the age of 1st student");
        a[0]=scan.nextInt();

        System.out.println("Enter the age of 2nd student");
        a[1]=scan.nextInt();

        System.out.println("Enter the age of 3rd student");
        a[2]=scan.nextInt();

        System.out.println("Enter the age of 4th student ");
        a[3]=scan.nextInt();

        System.out.println("Enter the age of 5th student");
        a[4]=scan.nextInt();

        System.out.println(a[0]+" ");
        System.out.println(a[1]+" ");
        System.out.println(a[2]+" ");
        System.out.println(a[3]+" ");
        System.out.println(a[4]+" ");
    }
}