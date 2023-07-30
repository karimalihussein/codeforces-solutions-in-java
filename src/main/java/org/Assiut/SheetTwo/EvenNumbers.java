package org.Assiut.SheetTwo;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n == 1) {
            System.out.println(-1);
            System.exit(0);
        }
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
