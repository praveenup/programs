package com.programs.codeforces.C;

import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        HashMap<String,Integer> m = new HashMap<>();
        String t = scn.nextLine();
        for (int i=0;i<n;i++ ){
            t = scn.nextLine();
            if(m.containsKey(t)){
                System.out.println(t+(m.get(t)+1));
                m.put(t,m.get(t)+1);
            }else {
                System.out.println("OK");
                m.put(t,0);
            }
        }
    }
}
