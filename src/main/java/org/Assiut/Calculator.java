package org.Assiut;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        String[] operands = expression.split("[+\\-*/]");

        if (operands.length != 2) {
            System.out.println("Invalid input format. Please enter a valid mathematical expression.");
            input.close();
            return;
        }

        int operand1 = Integer.parseInt(operands[0]);
        int operand2 = Integer.parseInt(operands[1]);
        char operator = expression.charAt(operands[0].length());

        OperationFactory factory = new OperationFactory();
        Operation operation = factory.createOperation(operator);

        if (operation != null) {
            int result = operation.calculate(operand1, operand2);
            System.out.println(result);
        } else {
            System.out.println("Invalid operator.");
        }
        input.close();
    }
}

interface Operation {
    int calculate(int operand1, int operand2);
}

class Addition implements Operation {
    @Override
    public int calculate(int operand1, int operand2) {
        return operand1 + operand2;
    }
}

class Subtraction implements Operation {
    @Override
    public int calculate(int operand1, int operand2) {
        return operand1 - operand2;
    }
}

class Multiplication implements Operation {
    @Override
    public int calculate(int operand1, int operand2) {
        return operand1 * operand2;
    }
}

class Division implements Operation {
    @Override
    public int calculate(int operand1, int operand2) {
        if (operand2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return operand1 / operand2;
    }
}

class OperationFactory {
    public Operation createOperation(char operator) {
        switch (operator) {
            case '+':
                return new Addition();
            case '-':
                return new Subtraction();
            case '*':
                return new Multiplication();
            case '/':
                return new Division();
            default:
                return null;
        }
    }
}
