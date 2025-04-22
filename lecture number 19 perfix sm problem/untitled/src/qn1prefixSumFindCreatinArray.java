import java.util.Scanner;
public class qn1prefixSumFindCreatinArray {
    static int [] perfixSumFind(int [] arr){
        int n=arr.length;
        int [] ans=new int[n];
        ans[0]=arr[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-i]+arr[i];
        }
        return ans;
    }
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the array of size ");
        num=sc.nextInt();
        int [] arr=new int [num];
        System.out.print("Enter the array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int [] ans=perfixSumFind(arr);
        printArray(ans);
    }
}
