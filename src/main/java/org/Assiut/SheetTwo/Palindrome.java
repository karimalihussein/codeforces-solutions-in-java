package org.Assiut.SheetTwo;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        int reversedNumber = reverseNumber(number);
        System.out.println(reversedNumber);
        System.out.println(number == reversedNumber ? "YES" : "NO");
    }

    private static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}
