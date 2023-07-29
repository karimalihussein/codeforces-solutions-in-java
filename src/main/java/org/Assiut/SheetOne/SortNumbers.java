package org.Assiut.SheetOne;

public class SortNumbers {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        scanner.close();
        int[] arr = {a, b, c};
        java.util.Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
