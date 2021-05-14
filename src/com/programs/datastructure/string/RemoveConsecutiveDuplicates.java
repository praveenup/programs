package com.programs.datastructure.string;

class RemoveConsecutiveDuplicates {
    String word;
    RemoveConsecutiveDuplicates(String w){
        word=w;
    }

    void removeCharacterDuplicates(){
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)!=word.charAt(i+1))
                System.out.print(word.charAt(i));
        }
        System.out.print(word.charAt(word.length()-1));
    }

    public static void main(String[]args){
        RemoveConsecutiveDuplicates obj = new RemoveConsecutiveDuplicates("a");
        obj.removeCharacterDuplicates();
    }
}
