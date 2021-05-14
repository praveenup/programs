package com.programs.dp;

public class Fibonacci {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
// TODO - Call Function Here

        int n=30;

        int[] dp = new int[n];
        dp[0]=1;
//        System.out.println(solve(n-1, dp));
        System.out.println(solve2(n));

        long endTime = System.nanoTime() - startTime;
        System.out.println(endTime);
    }

    private static int solve(int n, int[] dp) {
        if(dp[n]!=0) return  dp[n];
        if(n<2)
            dp[n] = 1;
        else
            dp[n] = solve(n-1, dp) + solve(n-2, dp);
        return dp[n];
    }

    private static int solve2(int n) {

        if(n<=2)
            return 1;

        return solve2(n-1) + solve2(n-2);
    }
}
