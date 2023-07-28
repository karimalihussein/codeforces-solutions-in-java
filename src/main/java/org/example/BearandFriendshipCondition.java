package org.example;
import java.util.*;
public class BearandFriendshipCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        int n = scanner.nextInt();
        int m =scanner.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        for(int i = 0; i < m; i++){
            c[a[i]-1]++;
            c[b[i]-1]++;
        }
        boolean flag = true;
        for(int i = 0; i < n; i++){
            if(c[i] == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }





}
