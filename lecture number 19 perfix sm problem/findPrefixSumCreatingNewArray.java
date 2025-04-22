import java.util.Scanner;
public class findPrefixSumCreatingNewArray {
    static int[] prefixSumArray(int [] arr){
        int n=arr.length;
        int [] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
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
        int []arr=new int[size];
        System.out.print("Enter the array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] pre=prefixSumArray(arr);
        printArray(pre);
    }
}
