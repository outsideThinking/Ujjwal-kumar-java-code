import java.util.Scanner;
public class practice{
    static int[] reverseKSteps(int[] arr, int k){
        int n=arr.length;
        int[] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the value of num: ");
        num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the array element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the steps of rotation: ");
        int k=sc.nextInt();

        int[] ans=reverseKSteps(arr, k);
        printArray(ans);
    }
}