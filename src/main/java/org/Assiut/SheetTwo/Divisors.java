package org.Assiut.SheetTwo;
import java.util.Scanner;
public class Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for(int i = 1; i <= n; i++){
            if(n % i == 0) System.out.println(i);
        }
    }
}
