import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal;
        System.out.println("Enter the decimal number: ");
        decimal=sc.nextInt();
        int pow=1;
        int ans=0;
        while (decimal>0){
            int rem=decimal%10;
            ans=ans+(rem*pow);

            decimal=decimal/10;
            pow=pow*2;
        }
        System.out.println(ans);
    }
}