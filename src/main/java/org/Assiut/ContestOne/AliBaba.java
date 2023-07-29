package org.Assiut.ContestOne;

import java.util.Scanner;

public class AliBaba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        scanner.close();
        int flag = 0;

        for (int i = 0; i < 3; i++) { // plus(0) - minus(1) - multiply(2)
            if (flag != 0) {
                break;
            }

            long result1 = 0;

            if (i == 0) {
                result1 = a + b;
            } else if (i == 1) {
                result1 = a - b;
            } else if (i == 2) {
                result1 = a * b;
            }

            for (int j = 0; j < 3; j++) {
                long result2 = 0;

                if (j == 0 && i != 0) {
                    result2 = result1 + c;
                } else if (j == 1 && i != 1) {
                    result2 = result1 - c;
                } else if (j == 2 && i != 2) {
                    if (i == 0) {
                        result2 = a + (b * c);
                    } else if (i == 1) {
                        result2 = a - (b * c);
                    } else {
                        result2 = result1 * c;
                    }
                }

                if (result2 == d) {
                    flag++;
                    break;
                }
            }
        }

        if (flag != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
