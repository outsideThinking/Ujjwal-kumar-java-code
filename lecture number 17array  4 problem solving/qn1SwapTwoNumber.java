import java.util.Scanner;
public class qn1SwapTwoNumber{
    static void swap(int x, int y){     //swap of function create
       int temp;    //swap of code write
       temp=x;
       x=y;
       y=temp;
        System.out.println("After swapping a of value "+x);//after swapping print
        System.out.print("After swappint b of value "+y);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the value of a ");
        a=sc.nextInt();
        System.out.print("Enter the value of b ");
        b=sc.nextInt();
        swap(a,b);      //swap function calling
    }
}