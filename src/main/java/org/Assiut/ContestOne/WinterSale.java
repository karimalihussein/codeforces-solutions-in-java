package org.Assiut.ContestOne;

import java.util.Scanner;

public class WinterSale {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int p = scanner.nextInt();
        scanner.close();
        double price = p / (1 - (x / 100.0));
        System.out.printf("%.2f", price);  
     }
}
