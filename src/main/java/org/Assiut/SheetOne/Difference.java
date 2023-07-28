package org.Assiut.SheetOne;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt(); 
        long b = scanner.nextInt(); 
        long c = scanner.nextInt();
        long d = scanner.nextInt();
        scanner.close();
        System.out.println("Difference = " + difference(a, b, c, d));

    }

    public static long difference(long a, long b, long c, long d) {
        return (a * b) - (c * d);
    }
   
}
