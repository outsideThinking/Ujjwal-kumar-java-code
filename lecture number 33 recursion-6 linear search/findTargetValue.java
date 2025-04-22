/* qn give an array of n integer and a target value x. print whether
x exist in the array or not
 */
import java.util.Scanner;
class findTargetValue{
    static boolean findTarget(int[]arr, int target, int idx){
        if(idx>=arr.length){
            return false;
        }
        if(arr[idx]==target) return true;
        return findTarget(arr,target,idx+1);
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
        if(findTarget(arr,target, 0)){
            System.out.println("Target present in the array ");
        }
        else{
            System.out.println("Target is not present in the array ");
        }
    }
}