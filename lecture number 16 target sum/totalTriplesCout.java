import java.util.Scanner;
public class totalTriplesCout {
    static int triplesCout(int [] arr, int sum){ //function create
        int n=arr.length; //n in store array of length
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the size of array ");
        num=sc.nextInt();
        int[] arr=new int[num];
        System.out.print("Enter the array element ");
        for(int i=0;i<arr.length;i++){ //loop create for array element
            arr[i]=sc.nextInt();
        }
        int sum;
        System.out.print("Enter  the sum of element "); //enter target element
        sum=sc.nextInt();
        System.out.print(triplesCout(arr,sum));
    }
}
