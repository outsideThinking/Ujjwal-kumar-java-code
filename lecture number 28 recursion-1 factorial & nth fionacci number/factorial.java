//find the value of factorial n
import java.util.Scanner;
public class factorial {
    static int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of find factorial ");
        n=sc.nextInt();
        int ans=factorial(n);
        System.out.println(ans);
    }
}
