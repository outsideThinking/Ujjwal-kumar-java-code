import java.util.Scanner;
public class qn2sumAlternativeNumberWithAlternativeSign {
    static int sumAlternativeSign(int size){
        if(size==0){
            return 0;
        }
        if(size%2==0){
           return sumAlternativeSign(size-1)-size;
        }
        else{
            return sumAlternativeSign(size-1)+size;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of value ");
        size=sc.nextInt();
        int ans=sumAlternativeSign(size);
        System.out.println(ans);
    }
}
