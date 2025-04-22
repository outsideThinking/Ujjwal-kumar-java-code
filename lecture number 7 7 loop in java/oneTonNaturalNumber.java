import java.util.Scanner;
public class oneTonNaturalNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the value of num ");
        num=sc.nextInt();
        int n=1;
        while(num>=n){
            System.out.println(n);
            n++;
        }
    }
}
