package org.Assiut.SheetOne;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        scanner.close();
        System.out.println(area(radius));
    }

    public static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
