import java.util.Scanner;
public class qn3partionTheArrayIntoTwoSubArray {
    static int sumOfArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return  sum;
    }
    static boolean particianOfArray(int[] arr){
        int perfixsum=0;
        int totalsum=sumOfArray(arr);
        for(int i=0;i<arr.length;i++){
            perfixsum=perfixsum+arr[i];
            int suffixSum=totalsum-perfixsum;
            if(perfixsum==suffixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the array of size ");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array elment ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean ans=particianOfArray(arr);
        System.out.println(ans);
    }
}
