import java.util.Scanner;
public class reverseArray{
    static int[] reverse(int [] arr){
        int n=arr.length;
        int [] ans=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j]=arr[i];
            j++;
        }
        return ans;
    }
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
        }
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int num;
       System.out.print("Enter the size of array ");
       num=sc.nextInt();
       int [] arr=new int [num];
       System.out.print("Enter the array element ");
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
       int[] ans=reverse(arr);
       printArray(ans);
    }
}