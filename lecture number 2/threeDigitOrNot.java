import java.util.Scanner;
public class threeDigitOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the num ");
        num=sc.nextInt();
        if(num>99 && num<1000){
            System.out.print("It is three idigit number ");
        }
        else{
            System.out.print("It is not three digit number ");
        }
    }
}
