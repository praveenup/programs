package com.programs.codeforces.A;

import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++ ){
            a[i] = scn.nextInt();
        }
        int co=0,ce=0,lo=1,le=1;
        for (int i=0;i<n;i++ ){
            if(a[i]%2==0){
                le=i;
                ce++;
            }else {
                lo=i;
                co++;
            }
        }
        if(co==1) System.out.println(lo+1);
        else System.out.println(le+1);
    }
}
