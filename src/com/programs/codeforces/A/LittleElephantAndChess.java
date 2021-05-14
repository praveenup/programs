package com.programs.codeforces.A;

import java.util.Scanner;

public class LittleElephantAndChess {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=8;
        int f=0;
        while (n>0){
            String s = scn.next();
            char c=s.charAt(0);

            for(int i=1;i<8;i++){
                if(c=='W' && ((i%2==1 && s.charAt(i)!='B') || (i%2==0 && s.charAt(i)!='W'))){
                    f=1;
                    break;
                }
                if(c=='B' && ((i%2==1 && s.charAt(i)!='W') || (i%2==0 && s.charAt(i)!='B'))){
                    f=1;
                    break;
                }
            }

            if(f==1){
                System.out.println("NO");
                break;
            }
            n--;
        }
        if(f==0)
            System.out.println("YES");


    }
}
