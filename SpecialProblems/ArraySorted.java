package SpecialProblems;

/**
 * Problem: Find first and last index of a element in string.
 * */
public class ArraySorted {

    public static boolean isSorted(int[] arr, int index){
        if(index == arr.length){
            return true;
        }
        if(arr[index] < arr[index - 1]){
            return false;
        }
        return isSorted(arr, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4};
        System.out.println(isSorted(arr, 1));
    }
}
