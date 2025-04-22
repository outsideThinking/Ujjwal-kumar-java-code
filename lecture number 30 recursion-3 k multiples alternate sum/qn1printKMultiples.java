import java.util.Scanner;
public class qn1printKMultiples {
    static void multiplesNum(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        multiplesNum(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        System.out.println("Enter the value of num ");
        n=sc.nextInt();
        System.out.println("Enter the value of k ");
        k=sc.nextInt();
        multiplesNum(n,k);
    }
}
