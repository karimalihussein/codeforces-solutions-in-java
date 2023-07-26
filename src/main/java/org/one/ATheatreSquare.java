package org.one;

import java.util.Scanner;

public class ATheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // rows
        int m = scanner.nextInt(); // columns
        int a = scanner.nextInt(); // flagstone size
        System.out.println(solve(n, m, a));
        scanner.close();
    }

    public static long solve(int n, int m, int a) {
        long x = n / a;
        long y = m / a;
        if (n % a != 0) {
            x++;
        }
        if (m % a != 0) {
            System.out.println("m % a = " + m % a);
            y++;
        }
        return x * y;
    }

    public static long solve2(int n, int m, int a) {
        long x = (long) Math.ceil((double) n / a);
        long y = (long) Math.ceil((double) m / a);
        return x * y;
    }

    public static long solve3(int n, int m, int a) {
        return (long) Math.ceil((double) n / a) * (long) Math.ceil((double) m / a);
    }
}