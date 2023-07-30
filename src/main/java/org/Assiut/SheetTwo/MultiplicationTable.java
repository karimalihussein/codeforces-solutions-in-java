package org.Assiut.SheetTwo;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }
    }
}
