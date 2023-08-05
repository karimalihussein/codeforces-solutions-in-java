package org.Assiut.SheetTwo;

import java.util.Scanner;

public class Shape2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            for(int i=1;i<=n;i++){
                System.out.print(' ');
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            input.close();
     }
}
