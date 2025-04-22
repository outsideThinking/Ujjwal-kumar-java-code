import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n ");
        n=sc.nextInt();
        if(n<0){
            n=n*(-1);

        }
        System.out.print(n);
    }

}
