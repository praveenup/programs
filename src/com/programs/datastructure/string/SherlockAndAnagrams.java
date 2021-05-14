package com.programs.datastructure.string;

import java.util.ArrayList;

public class SherlockAndAnagrams {

    static ArrayList<String> getAllSubstring(String s){
        ArrayList<String> subs = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length()+1;j++){
                subs.add(s.substring(i,j));
            }
        }
        return subs;
    }

    static Boolean checkAnagram(String a, String b){
        int[] count = new int[256];
        if(a.length()!=b.length())
            return false;
        for(int i=0;i<a.length();i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        for (Integer integer : count) {
            if (integer != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        String s = "kkkk";
        ArrayList<String> subs = getAllSubstring(s);
        for(int i=0;i<subs.size();i++){
            for(int j=i+1;j<subs.size();j++){
                if(checkAnagram(subs.get(i),subs.get(j))==true)
                    count++;
            }
        }
        System.out.println(count);
    }
}
