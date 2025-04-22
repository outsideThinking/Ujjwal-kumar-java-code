//qn1 sorted an array consisting of only os and 1s increasing order

import java.util.Scanner;
public class sortAnArrayincreasingOrder{
    static void zeroAndOneSorted(int [] arr){ //sorted array of function
        int n=arr.length;
        int countZero=0;
        for(int i=0;i<n;i++){      //sorted array of code write
            if(arr[i]==0){
                countZero++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<countZero){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
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
        int []arr=new int [num];
        System.out.print("Enter the zero and one array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Sorted array is ");
        zeroAndOneSorted(arr);  //calling sorted array of function
        printArray(arr);        //calling printed array of function
    }
}