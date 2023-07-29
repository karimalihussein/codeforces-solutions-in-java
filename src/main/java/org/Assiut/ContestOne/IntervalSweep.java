package org.Assiut.ContestOne;

import java.util.Scanner;

public class IntervalSweep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        scanner.close();
        if (a == 0 && b == 0) {
            System.out.println("NO");
        } else if (Math.abs(a - b) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
