package com.class2;
import java.util.Scanner;
// Print 1st n prime numbers.
public class Lab7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        printPrimeNums(n);
    }

    private static void printPrimeNums(int n) {
        int count=0;
        for(int i=1; count<n;i++){
            if(n%i==0){
                System.out.println(i);
                count++;

            }
        }
    }
}