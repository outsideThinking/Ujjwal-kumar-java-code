import javax.swing.*;
import java.util.Scanner;
public class practice {

  static int sumOfLToR(int[] arr, int l, int r){
      int n=arr.length;
      int sum=0;
      for(int i=l;i<r;i++){
          sum=sum+arr[i];
      }
      return sum;
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
        System.out.println("Enter the value of l: ");
        int l=sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r=sc.nextInt();

        int ans=sumOfLToR(arr,l,r);
        System.out.print(ans);
    }
}