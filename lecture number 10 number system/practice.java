import java.util.Scanner;
class practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal;
        System.out.println("Enter the decimal number: ");
        decimal=sc.nextInt();
        int ans=0;
        while(decimal>0){
            int rem=decimal%2;
            ans=(ans*10)+rem;

        }
    }
}