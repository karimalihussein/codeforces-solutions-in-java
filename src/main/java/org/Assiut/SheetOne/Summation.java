package org.Assiut.SheetOne;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        System.out.println(summation(n));
    }

    private static long summation(long n) {
        return n * (n + 1) / 2;
    }
}

