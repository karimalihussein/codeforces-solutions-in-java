package org.Assiut.SheetTwo;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = findSumOfOddNumbersBetween(x, y);
            System.out.println(sum);
        }
        sc.close();
    }

    private static int findSumOfOddNumbersBetween(int x, int y) {
        int start = Math.min(x, y) + 1;
        int end = Math.max(x, y) - 1;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        return sum;
    }
}
