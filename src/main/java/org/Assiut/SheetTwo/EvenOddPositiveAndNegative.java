package org.Assiut.SheetTwo;

import java.util.Scanner;

public class EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        int even = 0, odd = 0, positive = 0, negative = 0;
        for (int i = 0; i < counter; i++) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        }
        scanner.close();
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
    }
}
