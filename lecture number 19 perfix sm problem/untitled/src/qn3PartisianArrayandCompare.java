import java.util.Scanner;
public class qn3PartisianArrayandCompare {
    static int totalSum(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    static boolean partisianArray(int [] arr){
        int totalSum=totalSum(arr);
        int prefixSum=0;
        for(int i=0;i<arr.length;i++) {
            prefixSum = prefixSum + arr[i];

            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;
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
        System.out.print(partisianArray(arr));
    }
}
