package org.Assiut.ContestOne;

import java.util.Scanner;

public class DataTypeGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long a = scanner.nextLong();
        scanner.close();

        long result = n * k / a;

        if (result * a == n * k) {
            if (result <= Integer.MAX_VALUE) {
                System.out.println("int");
            } else {
                System.out.println("long long");
            }
        } else {
            System.out.println("double");
        }
    }
}
