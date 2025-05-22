import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num= sc.nextInt();
        int ans=0;
        while (num>0){
            int rem=num%10;
            ans=(ans*10)+rem;
            num=num/10;
        }
        int rev=ans;
        if(rev==num){
            System.out.println("It is panlindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }
}
