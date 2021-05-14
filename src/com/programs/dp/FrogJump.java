package com.programs.dp;

public class FrogJump {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
// TODO - Call Function Here

        int n=7;

        int[] dp = new int[n];
        System.out.println(solve(n-1, dp));

        long endTime = System.nanoTime() - startTime;
        System.out.println(endTime);
    }

    private static int solve(int n, int[] dp) {
        if(dp[n]!=0) return  dp[n];
        if(n<=1)
            dp[n] = 1;
        else
            dp[n] = solve(n-1, dp) + solve(n-2, dp);
        return dp[n];
    }
}
