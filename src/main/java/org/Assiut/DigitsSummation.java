package org.Assiut;

import java.util.Scanner;

public class DigitsSummation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        scanner.close();
        System.out.println(sumOfLastDigits(n, m));
    }

    private static long sumOfLastDigits(long n, long m) {
        long lastDigitN = n % 10;
        long lastDigitM = m % 10;

        return lastDigitN + lastDigitM;
    }
}
