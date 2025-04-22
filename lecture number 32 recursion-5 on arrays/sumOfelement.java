import java.util.Scanner;
public class sumOfelement {
    static int sumOfElement(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallPro=sumOfElement(arr,idx+1);
        return arr[idx]+smallPro;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array ");
        size=sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter the array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans=sumOfElement(arr,0);
        System.out.println("Print the sum of element ");
        System.out.println(ans);
    }
}
