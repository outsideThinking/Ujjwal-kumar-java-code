import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("Ente the value of a ");
        a=sc.nextInt();
        if(a%2==0){
            System.out.print("It is a even number ");
        }
        else{
            System.out.print("It is a odd number ");
        }
    }
}
