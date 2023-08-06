package org.Assiut.SheetTwo;

import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int startValue = 1;
        for (int i = 0; i < N; i++) {
            // Calculate the end value of the current line
            int endValue = startValue + 2;

            // Print the current line with the required format
            for (int j = startValue; j <= endValue; j++) {
                System.out.print(j + " ");
            }
            System.out.println("PUM");

            // Increment the startValue for the next line
            startValue += 4;
        }
    }
}
