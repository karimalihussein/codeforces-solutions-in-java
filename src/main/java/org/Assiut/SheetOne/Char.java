package org.Assiut.SheetOne;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.close();
        char x = input.next().charAt(0);
        char result = (x >= 'a' && x <= 'z') ? (char) (x - 32) : (char) (x + 32);
        System.out.println(result);
    }
}
