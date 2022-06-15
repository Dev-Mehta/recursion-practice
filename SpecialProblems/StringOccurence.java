package SpecialProblems;

/**
 * Problem: Find first and last index of a element in string.
 * */
public class StringOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, char search, int idx){
        if(idx == str.length()){
            if(first == -1){
                System.out.println("Element doesn't exist in string");
                return;
            }
            System.out.println("First, Last: " + first + "," + last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == search){
            if(first == -1){
                first = idx;
                last = idx;
            }
            else{
                last = idx;
            }
        }
        findOccurence(str, search, idx+1);
    }

    public static void main(String[] args) {
        String s = "Deveve";
        findOccurence(s, 'e', 0);
    }
}
