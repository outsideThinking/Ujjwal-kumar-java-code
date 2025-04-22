import java.util.Scanner;
public class totalPairOfSum {
    static int pairSum(int [] arr, int sum){ //create a function
        int n=arr.length;
        int count=0;
        for(int i=0;i<arr.length;i++){ //first for loop to create
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter size of array ");
        num=sc.nextInt();
        int [] arr=new int[num];
        System.out.print("Enter the array element ");
        for(int i=0;i<arr.length;i++){ //array element for create loop
            arr[i]=sc.nextInt();
        }
        int sum;
        System.out.print("Enter the sum "); //kitna sum ka pair chahiye
        sum=sc.nextInt();
        System.out.print(pairSum(arr,sum)); //for print purpose this code
    }
}
