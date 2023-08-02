package org.Assiut.SheetTwo;
import java.util.List;
import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        scanner.close();
        List<Integer> list = new java.util.ArrayList<>();
        for(int i = a; i <= b; i++){
            if(isLucky3(i)){
                list.add(i);
            }
        }
        if(list.size() == 0){
            System.out.println(-1);
        } else {
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static boolean isLucky(int n){
        while(n > 0){
            int digit = n % 10;
            if(digit != 4 && digit != 7) return false;
            n /= 10;
        }
        return true;
    }

    public static boolean isLucky2(int n){
        String s = String.valueOf(n);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '4' && s.charAt(i) != '7') return false;
        }
        return true;
    }

    public static boolean isLucky3(int n){
        String s = String.valueOf(n);
        return s.matches("[47]+");
    }
}
