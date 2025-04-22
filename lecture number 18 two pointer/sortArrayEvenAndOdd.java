//qn2 sorted even and odd array
import java.util.Scanner;
public class sortArrayEvenAndOdd {
    static void swap(int [] arr,int i,int j){ //swap function create
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortEvenOdd(int [] arr){ //sort even odd function create
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){   //sort of code write down
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr, left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    static void printArray(int [] arr){ //print of array function make
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
        System.out.print("Enter odd and even element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sortEvenOdd(arr); //sort array of call
        printArray(arr); //print array of call
    }
}
