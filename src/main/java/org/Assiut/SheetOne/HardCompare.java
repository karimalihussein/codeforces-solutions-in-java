package org.Assiut.SheetOne;

import java.util.Scanner;

public class HardCompare {
    private static final double EPSILON = 1e-9;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double D = scanner.nextDouble();
      

        scanner.close();

        System.out.println(isGreater(A, B, C, D) ? "YES" : "NO");
    }
    
    private static boolean isGreater(double A, double B, double C, double D) {
        double logAB = B * Math.log(A);
        double logCD = D * Math.log(C);

        if (isApproximatelyEqual(logAB, logCD)) {
            return compareDoubles(A, C) > 0;
        } else {
            return logAB > logCD;
        }
    }

    private static boolean isApproximatelyEqual(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }

    private static int compareDoubles(double a, double b) {
        if (isApproximatelyEqual(a, b)) {
            return 0;
        } else if (a < b) {
            return -1;
        } else {
            return 1;
        }
    }
}
