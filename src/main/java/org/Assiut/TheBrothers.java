package org.Assiut;

public class TheBrothers {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String person1 = scanner.nextLine();
        String person2 = scanner.nextLine();
        scanner.close();
        String[] person1Names = person1.split(" ");
        String[] person2Names = person2.split(" ");
        System.out.println(person1Names[1].equals(person2Names[1]) ? "ARE Brothers" : "NOT");
    }
}
