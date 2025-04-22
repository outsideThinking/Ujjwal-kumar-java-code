import java.util.Scanner;
public class printArray {
    static void printArray(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printArray(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={4,3,6,3,5,7};
        printArray(arr,0);
    }
}
