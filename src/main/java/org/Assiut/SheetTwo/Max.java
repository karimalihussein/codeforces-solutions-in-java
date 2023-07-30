package org.Assiut.SheetTwo;

import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        int[] numbers = new int[counter];
        for (int i = 0; i < counter; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println(max);
    }
}
