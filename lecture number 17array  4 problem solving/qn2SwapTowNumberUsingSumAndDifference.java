import java.util.Scanner;
public class qn2SwapTowNumberUsingSumAndDifference{
    static void swap(int x,int y){      //swap name of create function
        y=x+y;
        x=y-x;
        y=y-x;
        System.out.println("After swapping a of value "+x); //after swapping print the value
        System.out.print("After swapping b of value "+y);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the value of a");
        a=sc.nextInt();
        System.out.print("Enter the value of b ");
        b=sc.nextInt();
        swap(a,b); //swap of calling
    }
}