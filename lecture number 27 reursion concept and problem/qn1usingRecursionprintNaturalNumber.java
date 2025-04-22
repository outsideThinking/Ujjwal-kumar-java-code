/* write a program to print all natural number 1 to n using
recursion
 */
import java.util.Scanner;
public class qn1usingRecursionprintNaturalNumber {
    static void increaseNumber(int n){
        if(n==1){ // halting condition & base case
            System.out.println(n);
            return;
        }
        increaseNumber(n-1); //recursive call
        System.out.println(n); //self work
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the natural number of size ");
        n=sc.nextInt();
        increaseNumber(n);
    }
}
