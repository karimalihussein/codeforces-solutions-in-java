package org.Assiut.ContestOne;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int firstDigit = n / 10;
        int secondDigit = n % 10;
        if(secondDigit == 0){
            System.out.println("YES");
            System.exit(0);
        }
        if (firstDigit % secondDigit == 0 || secondDigit % firstDigit == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }   
}
