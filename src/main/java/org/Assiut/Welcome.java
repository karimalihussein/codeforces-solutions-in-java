package org.Assiut;


public class Welcome {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();
        printYesIfAGreaterThanOrEqualB(a, b);
    }

    private static void print(String s) {
        System.out.println(s);
    }
    public static void printYesIfAGreaterThanOrEqualB(long a, long b) {
        print(a >= b ? "Yes" : "No");
    }
}
