import java.util.Scanner;
public class countNumberOfDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the num ");
        num=sc.nextInt();
        int digit=0;
         while(num>0){
             num=num/10;
             digit++;
         }
         System.out.print("number of digit "+digit);
    }
}
