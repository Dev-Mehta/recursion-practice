// Qs. Print the sum of first n natural numbers

public class Question3{
    public static int printSum(int n, int sum){
        if(n == 0) return sum;
        sum += n;
        return printSum(n-1,sum);
    }

    public static void main(String[] args) {
        int sum = printSum(5, 0);
        System.out.println("Sum: " + sum);
    }
}