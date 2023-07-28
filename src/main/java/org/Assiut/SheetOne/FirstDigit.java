package org.Assiut.SheetOne;

import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberStr = Integer.toString(number);
        char firstDigitChar = numberStr.charAt(0);
        int firstDigit = Character.getNumericValue(firstDigitChar);
        System.out.println((firstDigit % 2 == 0) ? "EVEN" : "ODD");
        scanner.close();
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number (999 < X ≤ 9999): ");
        int number = scanner.nextInt();
        int firstDigit = number / 1000;
        System.out.println((firstDigit % 2 == 0) ? "Even" : "Odd");
        scanner.close();
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number (999 < X ≤ 9999): ");
        int number = scanner.nextInt();
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        System.out.println((firstDigit % 2 == 0) ? "Even" : "Odd");
        scanner.close();
    }

}
