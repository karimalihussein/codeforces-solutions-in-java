package org.Assiut.SheetTwo;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), gcd = 1;
        scanner.close();
        for(int i = 1; i <= a && i <= b; i++){
            if(a % i == 0 && b % i == 0) gcd = i;
        }
        System.out.println(gcd);
    }
}
