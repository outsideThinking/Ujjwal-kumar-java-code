import java.util.Scanner;
public class qn8divisibleby5And3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the num ");
        num=sc.nextInt();
        if(num%5==0 && num%3==0){
            System.out.print("It is divisible by 5 and 3 ");
        }
        else{
            System.out.print("It is not divisible by 5 and 3 ");
        }
    }
}
