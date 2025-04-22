import java.util.Scanner;
public class rotateTheArrayKSteps {
    static int[] rotate(int[]arr, int k){
        int n=arr.length;
        k=k%n;  //if k is greater than n so
        int []ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){ //right side array ko left side me
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){ //left side array ko right side me
            ans[j++]=arr[i];
        }
        return ans;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array ");
        size=sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter the array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k;
        System.out.println("Enter the steps of rotation ");
        k=sc.nextInt();
        System.out.println("Print the original array ");
        printArray(arr);
        System.out.println();
        System.out.print("Print the after rotation array ");
        int []ans=rotate(arr,k);
        printArray(ans);
    }
}
