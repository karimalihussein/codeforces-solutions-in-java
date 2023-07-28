package org.Assiut.SheetOne;

import java.util.Scanner;

public class BasicDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt(); // 32 bit integer
        long l = scanner.nextLong(); // 64 bit integer
        char c = scanner.next().charAt(0); // 8 bit Characters & symbols
        float f = scanner.nextFloat(); // 32 bit real value
        double d = scanner.nextDouble(); // 64 bit real value
        scanner.close();
        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);
    }
}
