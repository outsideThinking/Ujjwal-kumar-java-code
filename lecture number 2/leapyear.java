import java.util.Scanner;
public class leapyear{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.print("Enter the year ");
        year=sc.nextInt();
        if(year%4==0|| year%400==0 ||year%100==0){
            System.out.print("It is a leapyer ");
        }
        else{
            System.out.print("It is not a leapyear ");
        }
    }
}