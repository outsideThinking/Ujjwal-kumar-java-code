//sort array in increasing order using selection sort
import java.util.Scanner;
public class sortArrayIncreasingOrderUsingSelectionSort {
    static void sortArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIdx=i;
            for(int j=i+1;j<n;j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the value of size ");
        size=sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter the array element ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sortArray(arr);
        System.out.println("sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
