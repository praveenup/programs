package com.programs.codeforces.A;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        ArrayList<Integer> np = new ArrayList<>();
        ArrayList<Integer> pp = new ArrayList<>();
        ArrayList<Integer> zp = new ArrayList<>();

        for(int i=0;i<n;i++){
            int num = scn.nextInt();
            if(num<0){
                np.add(num);
            }else if(num>0){
                pp.add(num);
            }else {
                zp.add(num);
            }
        }
        if(pp.size()==0){
            pp.add(np.get(np.size()-1));
            np.remove(np.size()-1);
            pp.add(np.get(np.size()-1));
            np.remove(np.size()-1);
        }
        if(np.size()%2==0){
            zp.add(np.get(np.size()-1));
            np.remove(np.size()-1);
        }
        System.out.print(np.size());
        for(Integer i : np){
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.print(pp.size());
        for(Integer i : pp){
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.print(zp.size());
        for(Integer i : zp){
            System.out.print(" " + i);
        }

    }
}
