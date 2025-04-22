import java.util.Scanner;
public class pratice {
    static int perfixSum(int []arr, int l, int r){
        int n=arr.length;
        int sum=0;
        for(int i=l+1;i<=r;i++){
            sum=arr[i-1]+arr[i];
        }
        System.out.print(sum);
        return sum;
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
        int l, r;
        System.out.print("Enter the value of l ");
        l=sc.nextInt();
        System.out.print("Enter the value of r ");
        r=sc.nextInt();
        perfixSum(arr,l,r);
    }
}
