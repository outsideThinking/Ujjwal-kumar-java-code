/* Give an array of integer of size n. answer q queries where
you need to print the sum of value in a given range of indices
from l to r (both are included)
 */

import java.util.Scanner;
class qn2FindSumInToGivenRange{
    static int perfixSum(int[] arr,int l, int r) {
        int n = arr.length;
        int sum=0;
        for (int i = l; i < r; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array ");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array element ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int l,r;
        System.out.println("Enter the value of l and r ");
        l=sc.nextInt();
        r=sc.nextInt();
        int ans=perfixSum(arr,l,r);
        System.out.print(ans);
    }
}