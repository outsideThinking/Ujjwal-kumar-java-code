import java.util.Scanner;
public class secondLargest {
    static int findMax(int [] arr){ //there is find largest number
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondMax(int [] arr){ //there is find second largest number
    int mx=findMax(arr);
    for(int i=0;i<arr.length;i++){
        if(arr[i]==mx){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    int secondMx=findMax(arr);  //secondmx to call the function maxfind
    return secondMx;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the size of array ");
        num=sc.nextInt();
        int[] arr=new int[num];
        System.out.print("Enter the array element ");
        for(int i=0;i<arr.length;i++){  //for loop for input array element
            arr[i]=sc.nextInt();
        }
        System.out.print(secondMax(arr)); //print the second largest nubmer
    }
}
