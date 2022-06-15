// Qs. Print the value of x^n (Keep stack height = n)

public class Question6{
    public static int power(int x, int n){
        if(n == 1) return x;
        return x * power(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println("Power:" + power(2,4));
    }
}