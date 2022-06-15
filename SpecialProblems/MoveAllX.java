package SpecialProblems;

/**
 * Problem: Move all x to end.
 * Eg. abcxdexfgx
 * Out.abcdefgxxx
 * */
public class MoveAllX {

    public static void moveAllX(String str,String newStr,int index, int count){

        if(index == str.length()){
            newStr = newStr + "x".repeat(Math.max(0, count));
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        if(currChar == 'x'){
            moveAllX(str, newStr,index+1, count+1);
        }
        else{
            moveAllX(str, newStr+currChar, index+1, count);
        }
    }

    public static void main(String[] args) {
        String in = "abcxdexfgx";
        moveAllX(in,"", 0, 0);
    }
}
