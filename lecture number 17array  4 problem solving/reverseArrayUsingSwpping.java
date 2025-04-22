import java.util.Scanner;
public class reverseArrayUsingSwpping{
    static void swap(int[] arr, int i, int j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
    static void reverse(int [] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int num;
       System.out.print("Enter the size of array ");
       num=sc.nextInt();
       int [] arr=new int[num];
       System.out.print("Enter the array element ");
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
       reverse(arr);
       printArray(arr);
    }
}