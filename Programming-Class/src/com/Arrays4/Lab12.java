package com.Arrays4;
import java.util.Scanner;
// Print all subArrays of given size,whose sum is equal to k
public class Lab12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int size1 = scan.nextInt();
        int k = scan.nextInt();
        sumOfSubArrays(ar, size1, k);
    }
    private static void sumOfSubArrays(int[] ar, int size1, int k) {
        int count = 0, sum = 0;
        for (int i = 0; i <= ar.length - size1; i++) {
            sum = 0;
            for (int j = i; j < i + size1; j++) {
                sum=sum+ar[j];
            }
            if(sum == k) {
                for (int j = i; j < i + size1; j++){
                    System.out.print(ar[j]+" ");
                }
                System.out.println();
            }
        }
    }
}