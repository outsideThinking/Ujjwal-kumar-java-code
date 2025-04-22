import java.util.Scanner;
public class prefixSumWithoutCreateNewArray {
    static void prefixSum(int [] arr){ //create function prefix sum
        int n=arr.length;
        for(int i=1;i<n;i++) {  //array claculate of code
            arr[i] = arr[i - 1] + arr[i];
        }
    }
    static void printArray(int [] arr){ //print array of code
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        int num;
        System.out.print("Enter the size of array ");
        num=ab.nextInt();
        int [] arr=new int[num];
        System.out.print("Enter the array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=ab.nextInt();
        }
        prefixSum(arr); //prefix sum of array of calling
        printArray(arr);    //print array of calling
    }
}
