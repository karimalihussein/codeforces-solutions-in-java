package org.Assiut.SheetTwo;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            long n = sc.nextLong(); // Input number
            printDigitsFromRightToLeft(n);
        }
        sc.close();
    }

    private static void printDigitsFromRightToLeft(long number) {
        // Convert the number to a string to extract individual digits
        String numberStr = Long.toString(number);

        // Print the digits from right to left separated by space
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            System.out.print(numberStr.charAt(i) + " ");
        }
        System.out.println();
    }
}
