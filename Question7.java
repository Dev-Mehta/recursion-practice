// Qs. Print the value of x^n (Keep stack height = logn)

public class Question7{
    public static int power(int x, int n){
        if(n == 1) return x;
        if(n % 2 == 0){
            return power(x,n/2) * power(x, n/2);
        }
        else {
            return x * power(x, n/2) * power(x, n/2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Power:" + power(2,4));
    }
}