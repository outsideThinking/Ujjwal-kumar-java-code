import java.util.Scanner;
public class rotateArrayWithoutUsingNewArray {
    static void swap(int []arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr, int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateArrayBySteps(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);//reverse array using condition
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
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
        int[] arr=new int[size];
        System.out.println("Enter the array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k;
        System.out.println("Enter the steps of rotation ");
        k=sc.nextInt();
        System.out.println("Print the original element ");
        printArray(arr);
        System.out.println();
        System.out.println("Print the rotate array ");
        rotateArrayBySteps(arr,k);
        printArray(arr);
    }
}
