package org.Assiut;


public class TwoNumbers {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();

        if (b != 0) {
            System.out.println("floor " + a + " / " + b + " = " + floor(a, b));
            System.out.println("ceil " + a + " / " + b + " = " + ceil(a, b));
            System.out.println("round " + a + " / " + b + " = " + round(a, b));
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }

    private static long floor(long a, long b) {
        return a / b;
    }

    private static long ceil(long a, long b) {
        return (a + b - 1) / b;
    }

    private static long round(long a, long b) {
        return (a + b / 2) / b;
    }
}

