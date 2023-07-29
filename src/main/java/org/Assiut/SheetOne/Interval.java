package org.Assiut.SheetOne;

public class Interval {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double x = scanner.nextDouble();
        scanner.close();
        if (x >= 0 && x <= 25)
            System.out.println("Interval [0,25]");
        else if (x > 25 && x <= 50)
            System.out.println("Interval (25,50]");
        else if (x > 50 && x <= 75)
            System.out.println("Interval (50,75]");
        else if (x > 75 && x <= 100)
            System.out.println("Interval (75,100]");
        else
            System.out.println("Out of Intervals");
    }
}
