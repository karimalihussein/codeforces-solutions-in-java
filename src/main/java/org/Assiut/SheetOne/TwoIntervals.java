package org.Assiut.SheetOne;

import java.util.Scanner;

public class TwoIntervals {
      public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int l1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int l2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            IntervalCalculator intervalCalculator = new IntervalCalculator();
            int[] intersection = intervalCalculator.calculateIntersection(l1, r1, l2, r2);

            if (intersection == null) {
                System.out.println(-1);
            } else {
                System.out.println(intersection[0] + " " + intersection[1]);
            }
        } catch (Exception e) {
            System.out.println("Invalid input or error occurred: " + e.getMessage());
        }
    }
}

class IntervalCalculator {
    public int[] calculateIntersection(int l1, int r1, int l2, int r2) {
        int left = Math.max(l1, l2);
        int right = Math.min(r1, r2);

        if (left > right) {
            return null;
        }

        return new int[]{left, right};
    }
}
