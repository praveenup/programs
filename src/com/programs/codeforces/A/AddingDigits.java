package com.programs.codeforces.A;

import java.util.Scanner;


public class AddingDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int n = scn.nextInt();


        for(int i=0; i<n; i++){
            for(int j=0; j<10; j++){
//                String t1 = String.valueOf(a);
//                String t2 = String.valueOf(j);
                int num = a*10+j;
                if(num%b==0){
                    if(j==0) {
                        System.out.print(num);
                        for(int m=i;m<n-1;m++){
                            System.out.print("0");
                        }
                        return;
                    }
                    a=num;
                    break;
                }else if(j==9){
                    System.out.println("-1");
                    return;
                }
            }
        }
        System.out.println(a);
    }
}
