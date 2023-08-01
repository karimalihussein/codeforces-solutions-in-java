package org.Assiut.SheetTwo;

import java.util.Scanner;

public class OnePrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        boolean isPrime = true;
        if (n == 1)
            isPrime = false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime ? "YES" : "NO");
    }
}
