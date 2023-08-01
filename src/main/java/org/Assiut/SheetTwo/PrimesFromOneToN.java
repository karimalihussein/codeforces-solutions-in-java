package org.Assiut.SheetTwo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimesFromOneToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++)
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            if (isPrime){
                primes.add(i);
            }   
        }
        for (int i = 0; i < primes.size(); i++) {
            System.out.print(primes.get(i) + " ");  
        }
    }
}
