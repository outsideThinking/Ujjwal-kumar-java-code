import java.util.Scanner;
public class qn1findSumOfDigit {
    static int sumOfDigit(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int smallPro=sumOfDigit(n/10)+(n%10);
        return smallPro;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the digit ");
        n=sc.nextInt();
        int ans=sumOfDigit(n);
        System.out.println(ans);
    }
}
