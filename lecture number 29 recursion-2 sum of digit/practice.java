import java.util.Scanner;
class practice{
    static int pow(int p, int q){
        if(q==0) return 1;
        int small=pow(p,q-1);
        return p*small;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p,q;
        System.out.println("Enter the value of p ");
        p=sc.nextInt();
        System.out.println("Enter the value of q ");
        q=sc.nextInt();
        int ans=pow(p,q);
        System.out.println(ans);
    }
}