package org.Assiut.SheetOne;

import java.util.Scanner;

public class Comparison {
       public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            char symbol = scanner.next().charAt(0);
            int b = scanner.nextInt();

            ComparisonOperator operator = ComparisonFactory.createOperator(symbol);
            boolean result = operator.compare(a, b);

            System.out.println(result ? "Right" : "Wrong");
        } catch (Exception e) {
            System.out.println("Invalid input or error occurred: " + e.getMessage());
        }
    }
}

interface ComparisonOperator {
    boolean compare(int a, int b);
}

class LessThanOperator implements ComparisonOperator {
    @Override
    public boolean compare(int a, int b) {
        return a < b;
    }
}

class GreaterThanOperator implements ComparisonOperator {
    @Override
    public boolean compare(int a, int b) {
        return a > b;
    }
}

class EqualToOperator implements ComparisonOperator {
    @Override
    public boolean compare(int a, int b) {
        return a == b;
    }
}

class ComparisonFactory {
    public static ComparisonOperator createOperator(char symbol) {
        switch (symbol) {
            case '<':
                return new LessThanOperator();
            case '>':
                return new GreaterThanOperator();
            case '=':
                return new EqualToOperator();
            default:
                throw new IllegalArgumentException("Invalid symbol: " + symbol);
        }
    }
}
    



