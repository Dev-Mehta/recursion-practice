package SpecialProblems;

import java.util.HashSet;

/**
 * Print all unique substrings of a string.
 * */
public class Subsequences {
    public static void printSubsequences(String str, String newStr, int index,
                                         HashSet<String> unique){
        if(index == str.length()){
            if(unique.contains(newStr)) return;
            System.out.println(newStr);
            unique.add(newStr);
            return;
        }
        char currChar = str.charAt(index);
        // to be
        printSubsequences(str,newStr+currChar, index+1,unique);
        // not to be
        printSubsequences(str,newStr, index+1, unique);
    }
    public static void main(String[] args) {
        printSubsequences("abc","", 0, new HashSet<>());
    }
}
