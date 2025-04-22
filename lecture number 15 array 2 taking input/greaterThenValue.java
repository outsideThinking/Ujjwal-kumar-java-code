import java.util.Scanner;
public class greaterThenValue {
    static int findGreatestNumber(int [] arr, int greatest){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>greatest){
                count++;
            }
        }
        return count;
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
       int greatest;
        System.out.print("Enter the greatest number ");
        greatest=sc.nextInt();
        System.out.print("5 to greatest number " +findGreatestNumber(arr,greatest));
    }
}
