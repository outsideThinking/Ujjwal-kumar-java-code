import java.util.Scanner;
public class reverseTheDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the num ");
        num=sc.nextInt();
        int reverse=0;
        while(num>0){
            int reminder=num%10;
            reverse=(reverse*10)+reminder;
            num=num/10;
        }
        System.out.print(reverse);
    }
}
