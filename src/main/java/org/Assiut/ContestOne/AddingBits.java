package org.Assiut.ContestOne;


public class AddingBits {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        scanner.close();
        System.out.println(a ^ b);
    }
}
