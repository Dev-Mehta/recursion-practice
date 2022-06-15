package SpecialProblems;

/**
 * Print permutations of a string
 * Eg.
 * IN - abc
 * OUT
 *  abc
 *  acb
 *  bac
 *  bca
 *  cab
 *  cba
 * */
public class PermString {

    public static void printPerm(String str,String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPerm(newStr, perm+curr);
        }
    }

    public static void main(String[] args) {
        printPerm("abc", "");
    }
}
