import java.util.Scanner;
public class practice{
    static int[] sort0and1(int[] arr){
        int n=arr.length;
        int count=0;
        int[] ans=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
           ans[j]=0;
           j++;
        }
        for(int i=count;i<n;i++){
            ans[j]=1;
            j++;
        }
        return ans;
    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the value of num: ");
        num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the array element only 0&1: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=sort0and1(arr);
        printArray(ans);
    }
}