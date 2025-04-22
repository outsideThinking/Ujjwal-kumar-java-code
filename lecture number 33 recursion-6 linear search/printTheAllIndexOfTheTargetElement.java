import java.util.Scanner;
public class printTheAllIndexOfTheTargetElement {
    static void allIndicesPrint(int[]arr, int target, int idx){
        if(idx>=arr.length){
            return;
        }
        if(arr[idx]==target){
            System.out.println(idx);
        }
        allIndicesPrint(arr,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array ");
        size=sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter the array element ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target;
        System.out.println("Enter the target of value ");
        target=sc.nextInt();
        allIndicesPrint(arr,target,0);
    }
}
