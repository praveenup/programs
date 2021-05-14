package com.programs.codeforces.A;

import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        int n,k;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k = s.nextInt();
        int count = 0;
        for (int i=0; i<n; i++){
            int num = s.nextInt();
            if(5-num>=k)
                count++;
        }
        System.out.println(count/3);
    }
}
