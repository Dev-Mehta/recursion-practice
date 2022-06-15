package SpecialProblems;

public class TowerOfHanoi {

    public static void solveTowersOfHanoi(int n, String s, String h, String d){
        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + s + " to " + d);
            return;
        }
        solveTowersOfHanoi(n-1, s, d, h);
        System.out.println("Transfer disk " + n + " from " + s + " to " + d);
        solveTowersOfHanoi(n-1, h, s, d);
    }

    public static void main(String[] args) {
        solveTowersOfHanoi(4, "S","H", "D");
    }
}
