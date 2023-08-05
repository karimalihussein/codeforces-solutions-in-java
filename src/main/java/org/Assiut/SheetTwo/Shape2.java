package org.Assiut.SheetTwo;

import java.util.Scanner;

public class Shape2 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int lines = input.nextInt();  
     int spaces = lines - 1;
     input.close();   
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }   
    }
}
