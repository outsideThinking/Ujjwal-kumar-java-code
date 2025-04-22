import java.util.Scanner;
public class practice {
    static int[] prefixSum(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        ans[0]=arr[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+arr[i];

        }
        return ans;
    }

    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the size of array: ");
        num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the array element: ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=prefixSum(arr);
        printArray(ans);
    }
}