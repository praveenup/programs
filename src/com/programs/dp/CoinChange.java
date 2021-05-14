package com.programs.dp;

public class CoinChange {
    public static void main(String[] args) {
        int a=7;
        int x=1;
        int y=5;
        int z=10;
        int[] dp=new int[a+1];
        dp[0]=1;
        for(int i=x;i<=a;i++){
            dp[i]=dp[i]+dp[i-x];
        }
        for(int f : dp)
            System.out.print(f+" ");

        System.out.println();
        for(int i=y;i<=a;i++){
            dp[i]=dp[i]+dp[i-y];
        }
        for(int f : dp)
            System.out.print(f+" ");

        System.out.println();
        for(int i=z;i<=a;i++){
            dp[i]=dp[i]+dp[i-z];
        }
        for(int f : dp)
            System.out.print(f+" ");

        System.out.println();
        System.out.println(dp[a]);
    }
}
