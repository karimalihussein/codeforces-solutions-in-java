package org.Assiut;

public class MaxAndMin {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        System.out.println(min + " " + max);
    }
}
