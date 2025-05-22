import java.util.Scanner;
class practice{
   static int findSq(int p, int q){
       if(q==0)
           return 1;
       return p*findSq(p,q-1);
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of p: ");
        int p=sc.nextInt();
        System.out.print("Enter the value of q: ");
        int q=sc.nextInt();
        System.out.print(findSq(p,q));
    }
}