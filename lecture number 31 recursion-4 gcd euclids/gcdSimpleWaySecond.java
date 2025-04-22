import java.util.Scanner;
public class gcdSimpleWaySecond {
    static int gcd(int x, int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the value of x and y ");
        x=sc.nextInt();
        y=sc.nextInt();
        int ans=gcd(x,y);
        System.out.println("Gcd is ");
        System.out.println(ans);
    }
}
