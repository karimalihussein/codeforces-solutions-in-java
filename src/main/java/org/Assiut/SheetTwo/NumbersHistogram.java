package org.Assiut.SheetTwo;
import java.util.Scanner;

public class NumbersHistogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        int lines = in.nextInt();
        for (int i = 0; i < lines; i++) {
            int num = in.nextInt();
            for (int j = 0; j < num; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
