package com.class1;
import java.util.Scanner;
// Whether the given number is prime or not.
public class Lab6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        isPrimeOrNot(n);
    }

    private static void isPrimeOrNot(int n) {
        int count=0;
        for(int i=2;i<=n/2;i++){  // other ways -->(i<=n-1,i<=n/2,i*i<=n)
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a Prime");
        }
    }


}
