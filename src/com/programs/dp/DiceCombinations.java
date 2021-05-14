package com.programs.dp;

import java.util.Scanner;

public class DiceCombinations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(i<j){
                    break;
                }
                dp[i] = (dp[i] + dp[i-j]) % 1000000007;
            }
        }
        System.out.println(dp[n]);
    }
}
