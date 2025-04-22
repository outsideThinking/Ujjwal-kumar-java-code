import java.util.Scanner;
public class qn12divisibleBy3And5ButNot15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the num ");
        num=sc.nextInt();
        if(num%3==0 || num%5==0){
            if(num%15!=0){
                System.out.print("It is divisible by 3 and 5 but not divisible by 15 ");
            }
            else{
            System.out.print("not maching required condition ");}
        }
        else{
            System.out.print("not maching required condition ");
        }
    }
}
