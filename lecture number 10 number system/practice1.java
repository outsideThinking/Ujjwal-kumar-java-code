import java.util.Scanner;
class practice1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal;
        System.out.println("Enter the decimal number ");
        decimal=sc.nextInt();
        int ans=0;
        int pow=1;
        while (decimal>0){
            int digit=decimal%2;
            ans=ans+(digit*pow);
            decimal=decimal/2;
            pow=pow*10;
        }
        System.out.println(ans);
    }
}