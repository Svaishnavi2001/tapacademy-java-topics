package com.Arrays4;
import java.util.Scanner;
// Print all subArrays of a given Array.
public class Lab13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        printAllSubArrays(ar);
    }

    private static void printAllSubArrays(int[] ar) {
        for (int size = 1; size <=ar.length; size++) {
            for (int i = 0; i <= ar.length-size; i++) {
                for (int j = i; j < i + size; j++) {
                    System.out.print(ar[j]+" ");
                }
                System.out.println();
            }
        }
    }
}


