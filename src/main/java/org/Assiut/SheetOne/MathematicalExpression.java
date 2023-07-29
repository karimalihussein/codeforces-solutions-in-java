package org.Assiut.SheetOne;

import java.util.Scanner;

public class MathematicalExpression {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            char operatorSymbol = scanner.next().charAt(0);
            int b = scanner.nextInt();
            String equalsSymbol = scanner.next();
            int c = scanner.nextInt();
            scanner.close();

            OperatorFactory factory = new OperatorFactory();
            MathOperator operator = factory.createOperator(operatorSymbol);

            if (operator == null) {
                System.out.println("Invalid operator: " + operatorSymbol);
                return;
            }

            int result = operator.operate(a, b);
            System.out.println(result == c ? "Yes" : result);
        } catch (Exception e) {
            System.out.println("Invalid input or error occurred: " + e.getMessage());
        }
    }
}

interface MathOperator {
    int operate(int a, int b);
}

class AddOperator implements MathOperator {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}

class SubtractOperator implements MathOperator {
    @Override
    public int operate(int a, int b) {
        return a - b;
    }
}

class MultiplyOperator implements MathOperator {
    @Override
    public int operate(int a, int b) {
        return a * b;
    }
}

class DivideOperator implements MathOperator {
    @Override
    public int operate(int a, int b) {
        return a / b;
    }
}

class ModulusOperator implements MathOperator {
    @Override
    public int operate(int a, int b) {
        return a % b;
    }
}

class OperatorFactory {
    public MathOperator createOperator(char operatorSymbol) {
        switch (operatorSymbol) {
            case '+':
                return new AddOperator();
            case '-':
                return new SubtractOperator();
            case '*':
                return new MultiplyOperator();
            case '/':
                return new DivideOperator();
            case '%':
                return new ModulusOperator();
            default:
                return null;
        }
    }
}

