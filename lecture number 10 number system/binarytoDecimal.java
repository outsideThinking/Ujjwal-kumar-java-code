//convert binary to decimal number
import java.util.Scanner;
public class binarytoDecimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int binary_num;
        System.out.print("Enter the binary number ");
        binary_num=sc.nextInt();
        int ans=0;
         int pow=1;
         while(binary_num>0){
             int digit=binary_num%10;
             ans=ans+(digit*pow);
             binary_num=binary_num/10;
             pow=pow*2;
         }
         System.out.print(ans);
    }
}
