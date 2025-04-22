//return the count of digits in a given number n
import java.util.Scanner;
public class countOfDigit {
    static int count(int n){
        if(n<10) return 1;
        return 1+count(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n ");
        n=sc.nextInt();
        int ans=count(n);
        System.out.println("number of digit is ");
        System.out.println(ans);
    }
}
