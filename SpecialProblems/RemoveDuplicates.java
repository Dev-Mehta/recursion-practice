package SpecialProblems;

import java.util.HashMap;

/**
 * Problem: Remove all duplicates from a string
 * In:  abbcccddd
 * Out: abcd
 * */
public class RemoveDuplicates {
    public static void removeDuplicates(String str, String newStr,
                                        HashMap<Character, Boolean> occured, int index){

        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        try{
            if(!occured.get(currChar)){
                occured.put(currChar, true);
                removeDuplicates(str,newStr+currChar, occured, index+1);
            }
            else{
                removeDuplicates(str, newStr, occured, index+1);
            }
        }
        catch (NullPointerException e){
            occured.put(currChar, true);
            removeDuplicates(str, newStr+currChar, occured, index+1);
        }
    }
    public static void main(String[] args) {
        String in = "abbcccdddd";
        removeDuplicates(in,"", new HashMap<>(), 0);
    }
}
