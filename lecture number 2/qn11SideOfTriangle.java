import java.util.Scanner;
public class qn11SideOfTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int first_side,second_side,third_side;
        System.out.print("Enter the first side ");
        first_side=sc.nextInt();
        System.out.print("Enter the second side ");
        second_side=sc.nextInt();
        System.out.print("Enter the third side ");
        third_side=sc.nextInt();
        if(first_side+second_side>third_side && second_side+third_side>first_side && first_side+third_side>second_side){
            System.out.print("valid triangle ");
        }
        else{
            System.out.print("invlid triangle ");
        }
    }
}
