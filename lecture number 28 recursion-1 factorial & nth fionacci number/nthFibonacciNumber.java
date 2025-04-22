//program to find nth fibonacci number
import java.util.Scanner;
public class nthFibonacciNumber {
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int previous=fib(n-1);
        int prePrevious=fib(n-2);
        return previous+prePrevious;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the fibonacci place ");
        n=sc.nextInt();
         int ans=fib(n);
        System.out.println(ans);
    }
}
