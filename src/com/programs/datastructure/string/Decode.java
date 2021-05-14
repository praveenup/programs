package com.programs.datastructure.string;

import java.util.ArrayList;
import java.util.HashMap;

public class Decode {

    public  static String reverseWordsInString(String string) {
        // Write your code here.
        String[] r = string.split(" ");
        String t ="";
        for(String s : r){
            if(!(s.equals(r[r.length-1])))
                t=" "+s+t;
            else t=s+t;
        }
        return t;
    }
    public static ArrayList<String> validIPAddresses(String string) {
        // Write your code here.
        StringBuilder s = new StringBuilder(string);

        ArrayList<String> a = new ArrayList<String>();
        if(s.length()<4) return a;
        String r = "";
        for(int i=0;i<3;i++)
        {

            if(s.length()-i-1>=3){
                r = r + s.charAt(i);
            }else break;
            a.add(r+".");
        }


        System.out.println(a);

        return new ArrayList<String>();

    }
    public static boolean generateDocument(String c, String d) {
        // Write your code here.
        if(d.length()==0)
            return true;

        HashMap<Character, Integer> m = new HashMap<>();
        for(int i=0;i<c.length();i++){
            m.put(c.charAt(i),m.getOrDefault(c.charAt(i),0)+1);
        }
        HashMap<Character, Integer> n = new HashMap<>();
        for(int i=0;i<d.length();i++){
            n.put(d.charAt(i),n.getOrDefault(d.charAt(i),0)+1);
        }
        for(Character s : n.keySet()){
            System.out.println(s);
            if(n.get(s)>m.get(s)) return false;
        }
        return true;
    }
    public static String runLengthEncoding(String s) {
        // Write your code here.
        String res="";
        int c=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)&&c!=9){
                c++;
                if(i==s.length()-2) {
                    System.out.print(c);
                    System.out.print(s.charAt(i));
                }
            }else{
                System.out.print(c);
                System.out.print(s.charAt(i));
                c=1;
            }
        }
        return res;
    }
    //9A4A2B4C2D
    public static String caesarCypherEncryptor(String str, int k) {
        // Write your code here.
        StringBuilder res=new StringBuilder(str);
        for(int i=0;i<res.length();i++){
            System.out.println((res.charAt(i)+k%26));
            if(((int)res.charAt(i)+k%26)>122){
                int t =96+((int)res.charAt(i)+k%26)%122;
                System.out.println(t);
                res.setCharAt(i,(char)t);
            }else{
                int t =((int)res.charAt(i))+k%26;
                res.setCharAt(i,(char)t);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWordsInString("a ab a"));
    }
}
