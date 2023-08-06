package org.Assiut.SheetTwo;

import java.util.Scanner;

public class SomeSums {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            int digitSum = calculateSumOfDigits(i);
            if (digitSum >= A && digitSum <= B) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    // Function to calculate the sum of digits of a number
    private static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
