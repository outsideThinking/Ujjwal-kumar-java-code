//convert decimal to binary number
import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int decimal_number;
        System.out.print("Enter the decimal number ");
        decimal_number=sc.nextInt();
        int ans=0;
        int pow=1;
        while(decimal_number>0){
            int reminder=decimal_number%2;
            ans=ans+(reminder*pow);
            pow=pow*10;
            decimal_number=decimal_number/2;
        }
        System.out.print(ans);
    }
}
