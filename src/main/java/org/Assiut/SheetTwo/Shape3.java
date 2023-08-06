package org.Assiut.SheetTwo;

import java.util.Scanner;

public class Shape3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        // Print the upper part of the diamond
        for (int i = 1; i <= N; i++) {
            // Print spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Print the lower part of the diamond
        for (int i = N - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
