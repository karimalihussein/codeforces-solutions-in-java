package org.Assiut.ContestOne;

import java.util.Scanner;

public class Katryoshka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long k = scanner.nextLong();
        scanner.close();
        System.out.println(getNumberOfKatryoshka(n, m, k));
    }

    private static long getNumberOfKatryoshka(long n, long m, long k) {
       long ans = 0;
        if (n == 0 || k == 0) {
            ans = 0;
        } else {
            long mn = Math.min(Math.min(n, m), k);
            n -= mn;
            m -= mn;
            k -= mn;
            ans += mn;
            ans += Math.min(n / 2, k);
        }
        return ans;
    }
}
