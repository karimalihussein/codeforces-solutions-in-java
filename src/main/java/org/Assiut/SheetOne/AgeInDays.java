package org.Assiut.SheetOne;
import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        scanner.close();
        int years = days / 365;
        days %= 365;
        int months = days / 30;
        days %= 30;
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");
    }
}
