package org.Assiut.SheetOne;

import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt(); // 32 bit integer
        long b = scanner.nextInt(); // 32 bit integer
        scanner.close();
        System.out.println(a + " + " + b + " = " + add(a, b));
        System.out.println(a + " * " + b + " = " + multiply(a, b));
        System.out.println(a + " - " + b + " = " + subtract(a, b));
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static long multiply(long a, long b) {
        return a * b;
    }

    public static long subtract(long a, long b) {
        return a - b;
    }

}
