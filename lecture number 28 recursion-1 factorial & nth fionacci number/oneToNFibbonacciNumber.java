import java.util.Scanner;
public class oneToNFibbonacciNumber {
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int pre=fib(n-1);
        int prePre=fib(n-2);
        return pre+prePre;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n;
        System.out.println("Enter the size of fibonnacci series ");
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(fib(i));
        }
   }
}
