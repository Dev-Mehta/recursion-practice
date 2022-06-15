package SpecialProblems;

public class StringReverse {

    public static void reverse(String str, String rev, int idx){
        if(idx < 0){
            System.out.println("Reverse: " + rev);
            return;
        }
        char currChar = str.charAt(idx);
        reverse(str,rev+currChar, idx-1);
    }

    public static void main(String[] args) {
        String s = "Dev";
        reverse(s, "", s.length()-1);
    }
}
