import javax.swing.*;
import java.util.Scanner;
public class practice {


     static int[] sortedSquareNonDec(int[] arr){
         int n=arr.length;
         int left=0;
         int right=n-1;
         int [] ans=new int[n];
         int j=0;
         while (left<=right){
                 if(Math.abs(arr[left])>Math.abs(arr[right])){
                     ans[j++]=arr[left]*arr[left];
                     left++;
                 }
                 else {
                     ans[j++]=arr[right]*arr[right];
                     right--;
                 }

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
        System.out.println("Enter the size of array: ");
        num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the array element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=sortedSquareNonDec(arr);
        printArray(ans);
    }
}