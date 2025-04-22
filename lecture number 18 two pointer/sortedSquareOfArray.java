//qn3 Give an integer array 'a' sorted in non-decreasing order, return
// an array of the squares of each number sorted in non-decreasing order
import java.util.Scanner;
public class sortedSquareOfArray {
    static void swap(int [] arr, int i, int j){ //swap function create
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] sortedSquareArray(int [] arr){ //sorted array function create
        int n=arr.length;
        int left=0;
        int right=n-1;
        int [] ans=new int[n];
        int k=0;
        while(left<=right){  //sorted array of write a code
            if(Math.abs(arr[left])>Math.abs(arr[right])){
            ans[k++]=arr[left]*arr[left];
            left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    static void printArray(int[] arr){ //print array create
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
        System.out.print("Enter the non decreasing in array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans= sortedSquareArray(arr); //sorted function call
        printArray(ans);    //print function call
    }
}
