package org.example;
import java.io.*;
import java.util.*;
public class BearandFriendshipCondition {

    /*
    Bear Limak examines a social network. Its main functionality is that two members can become friends (then they can talk with each other and share funny pictures).

    There are n members, numbered 1 through n. m pairs of members are friends. Of course, a member can't be a friend with themselves.

    Let A-B denote that members A and B are friends. Limak thinks that a network is reasonable if and only if the following condition is satisfied: For every three distinct members (X, Y, Z), if X-Y and Y-Z then also X-Z.

    For example: if Alan and Bob are friends, and Bob and Ciri are friends, then Alan and Ciri should be friends as well.

    Can you help Limak and check if the network is reasonable? Print "YES" or "NO" accordingly, without the quotes.

    Input
    The first line of the input contain two integers n and m (3 ≤ n ≤ 150 000, ) — the number of members and the number of pairs of members that are friends.

    The i-th of the next m lines contains two distinct integers ai and bi (1 ≤ ai, bi ≤ n, ai ≠ bi). Members ai and bi are friends with each other. No pair of members will appear more than once in the input.

    Output
    If the given network is reasonable, print "YES" in a single line (without the quotes). Otherwise, print "NO" in a single line (without the quotes).
     */

    // exmaple input
    // 4 3
    //1 3
    //3 4
    //1 4
    // example output
    // YES

    // input
    // 4 4
    // 3 1
    // 2 3
    // 3 4
    // 1 2
    // output
    // NO

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
