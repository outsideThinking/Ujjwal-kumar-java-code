import java.util.Scanner;
public class sumOfSubstractAndEvenOfAdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the num ");
        num=sc.nextInt();
        int ans=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                ans=ans-i;
            }
            else{
                ans=ans+1;
            }
        }
        System.out.print(ans);
    }
}
