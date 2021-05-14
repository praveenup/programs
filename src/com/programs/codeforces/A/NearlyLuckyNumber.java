package com.programs.codeforces.A;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        long n;
        Scanner s = new Scanner(System.in);
        n = s.nextLong();
        int count=0;
        while(n>0){
            long r = n%10;
            if(r==4 || r==7)
            {
                count++;
            }
            n=n/10;
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
