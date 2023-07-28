package org.Assiut;

import java.util.Scanner;

public class CapitalSmallDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.close();
        char ch = input.next().charAt(0);
        switch (Character.getType(ch)) {
            case Character.DECIMAL_DIGIT_NUMBER:
                System.out.println("IS DIGIT");
                break;
            case Character.UPPERCASE_LETTER:
            case Character.LOWERCASE_LETTER:
                System.out.println("ALPHA");
                if (Character.isUpperCase(ch)) {
                    System.out.println("IS CAPITAL");
                } else {
                    System.out.println("IS SMALL");
                }
                break;
            default:
                System.out.println("UNKNOWN CHARACTER");
                break;
        }

    }
}
