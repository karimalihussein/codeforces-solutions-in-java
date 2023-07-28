package org.Assiut.SheetOne;

public class Multiples {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();
        printMultiplesIfAMultipleOfB(a, b);
    }

    private static void print(String s) {
        System.out.println(s);
    }

    public static void printMultiplesIfAMultipleOfB(long a, long b) {
        print(a % b == 0 || b % a == 0 ? "Multiples" : "No Multiples");
    }
}
