import java.util.Scanner;
public class gcdInSimpleWay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the value of x y ");
        x=sc.nextInt();
        y=sc.nextInt();
        int min=(x<y)?x:y;
        int ans=0;
        for(int i=min;i>=1;i--){
            if(x%i==0 && y%i==0){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
