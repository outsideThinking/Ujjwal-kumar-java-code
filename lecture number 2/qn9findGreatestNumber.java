import java.util.Scanner;
public class qn9findGreatestNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the value of a ");
        a=sc.nextInt();
        System.out.print("Enter the value of b ");
        b=sc.nextInt();
        System.out.print("Enter the value of c ");
        c=sc.nextInt();
        if(a>b &&a>c){
            System.out.print("It is greatest "+a);
        }
        else if(b>a && b>c){
            System.out.print("It is greatest "+b);
        }
        else{
            System.out.print("It is greatest "+c);
        }
    }

}
