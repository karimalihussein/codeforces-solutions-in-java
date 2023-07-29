package org.Assiut.ContestOne;

import java.util.Scanner;

public class NextAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        scanner.close();
        System.out.println(c == 'z' ? 'a' : (char)(c + 1));
    }
}
