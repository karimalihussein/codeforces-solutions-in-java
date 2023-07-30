package org.Assiut.SheetTwo;

import java.util.Scanner;

public class FixedPassword {
    public static void main(String[] args) {
        int password = 1999;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input != password) {
            System.out.println("Wrong");
            input = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Correct");
    }
}
