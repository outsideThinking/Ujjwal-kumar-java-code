import java.util.Scanner;
public class qn2findPsquareQ {
    static int power(int p, int q){
        if(q==0){
            return 1;
        }
        return p*power(p,q-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p,q;
        System.out.println("Enter the p of value ");
        p=sc.nextInt();
        System.out.println("Enter the q of value ");
        q=sc.nextInt();
        int ans=power(p,q);
        System.out.println("P of square q is ");
        System.out.println(ans);
    }
}
