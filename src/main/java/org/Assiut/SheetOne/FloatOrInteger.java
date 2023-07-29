package org.Assiut.SheetOne;

public class FloatOrInteger {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        float number = input.nextFloat();
        input.close();
        System.out.println(number % 1 == 0 ? "int " + (int) number : "float " + (int) number + " " + number % 1);
    }
}
