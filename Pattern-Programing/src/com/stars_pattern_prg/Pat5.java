package com.stars_pattern_prg;
/*
*****
 ****
  ***
   **
    *
 */
public class Pat5 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=5-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
