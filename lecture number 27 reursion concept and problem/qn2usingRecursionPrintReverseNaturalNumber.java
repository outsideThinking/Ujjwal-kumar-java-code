/* write a program to print all natural number from n to 1
using recursion
 */
import java.util.Scanner;
public class qn2usingRecursionPrintReverseNaturalNumber {
    static void decresingOrder(int n){
        if(n==1){ // halting condition & base case
            System.out.println(1);
            return;
        }
        System.out.println(n); //self work
        decresingOrder(n-1); //recursive call
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the natural number of size ");
        n=sc.nextInt();
        decresingOrder(n);
    }
}
