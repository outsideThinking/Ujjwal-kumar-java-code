import java.util.Scanner;
public class maxValueUsingRecursion {
    static int maxValue(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallpro=maxValue(arr,idx+1);
        return Math.max(arr[idx],smallpro);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the array of size ");
        size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans=maxValue(arr,0);
        System.out.println("Print the maximum value ");
        System.out.println(ans);
    }
}
