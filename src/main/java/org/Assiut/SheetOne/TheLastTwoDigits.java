package org.Assiut.SheetOne;

import java.util.Scanner;

public class TheLastTwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        scanner.close();

        long lastTwoDigitsProduct = calculateLastTwoDigitsProduct(a, b, c, d);
        String result = formatTwoDigits(lastTwoDigitsProduct);
        System.out.println(result);
    }

    private static long calculateLastTwoDigitsProduct(long a, long b, long c, long d) {
        long newA = a % 100;
        long newB = b % 100;
        long newC = c % 100;
        long newD = d % 100;

        long product = (newA * newB * newC * newD) % 100;
        return product;
    }

    private static String formatTwoDigits(long number) {
        return String.format("%02d", number);
    }
}
