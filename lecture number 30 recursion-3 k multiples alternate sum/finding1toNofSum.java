import java.util.Scanner;
public class finding1toNofSum {
    static int seriesSum(int size){
        if(size==0){
            return 0;
        }
        return seriesSum(size-1)+size;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of value ");
        size=sc.nextInt();
        int ans=seriesSum(size);
        System.out.println(ans);
    }
}
