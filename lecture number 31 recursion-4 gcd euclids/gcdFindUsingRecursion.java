import java.util.Scanner;
public class gcdFindUsingRecursion {
    static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y, x%y);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int x,y;
        System.out.println("Enter the value of x and y ");
        x=sc.nextInt();
        y=sc.nextInt();
        int ans=gcd(x,y);
        System.out.println("gcd is using recursion ");
        System.out.println(ans);
    }
}
