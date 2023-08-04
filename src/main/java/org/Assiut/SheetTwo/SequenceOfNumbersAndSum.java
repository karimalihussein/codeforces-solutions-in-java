package org.Assiut.SheetTwo;

import java.util.Scanner;

public class SequenceOfNumbersAndSum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Check if either number is less than or equal to zero
            if (n <= 0 || m <= 0) {
                break;
            }

            printNumbersAndSum(n, m);
        }
    }

    private static void printNumbersAndSum(int n, int m) {
        int sum = 0;
        StringBuilder result = new StringBuilder();

        // Determine the starting and ending points for the loop
        int start = Math.min(n, m);
        int end = Math.max(n, m);

        for (int i = start; i <= end; i++) {
            result.append(i).append(" ");
            sum += i;
        }

        System.out.println(result.toString() + "sum =" + sum);
    }
}






