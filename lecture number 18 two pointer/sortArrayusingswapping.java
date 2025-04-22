//qn1 of sorted an array consisting of only 0s and 1s increasing order
//second way to solve question
import java.util.Scanner;
public class sortArrayusingswapping {
    static void swap(int [] arr, int i, int j){    //swapping of code
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortArray(int [] arr){ //sort array of function
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right) {
            if(arr[left]==1 && arr[right]==0){ //if array left array =1 and right arry on the 0 the swap function of call

                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
        }
        static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
        }
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the size of array ");
        num=sc.nextInt();
        int [] arr=new int[num];
        System.out.print("Enter the 0 and 1 of array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sortArray(arr); //sorted array of calling
        printArray(arr);    //print array of calling
    }
}
