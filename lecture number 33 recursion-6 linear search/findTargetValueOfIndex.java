/* given an array of n integer and a target value x print whether
target of index
 */
import java.util.Scanner;
public class findTargetValueOfIndex {
    static int targetValueOfIndex(int[]arr,int target, int idx){
        if(idx>arr.length){
            return -1;
        }
        if(arr[idx]==target) return idx;
        return targetValueOfIndex(arr,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the array of size ");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array element ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target;
        System.out.println("Enter the target of value ");
        target=sc.nextInt();
        System.out.println(targetValueOfIndex(arr,target,0));
    }
}
