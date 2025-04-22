/* give an array integer array 'a' return the prefix sum/running
sum in the same array without creating a new array
 */
import java.util.Scanner;
public class findPrefixSumWithoutCreatingNewArray {
    static int[] prefixSum(int [] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array ");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter the array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        prefixSum(arr);
        printArray(arr);
    }
}
