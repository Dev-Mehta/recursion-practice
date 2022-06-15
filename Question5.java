// Qs. Print the fibonacci sequence till nth term

public class Question5{
    public static void fibonacci(int a, int b, int end){
        if(end == 0) return;
        int c = a + b;
        System.out.print(a + " ");
        fibonacci(b,c,end-1);
    }

    public static void main(String[] args) {
        fibonacci(0,1,10);
    }
}