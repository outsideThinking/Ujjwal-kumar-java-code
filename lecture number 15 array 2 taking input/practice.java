import java.util.Scanner;
public class practice {
    static boolean sortedArray(int[] arr){
        for(int i=1;i<=arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the size of array: ");
        num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the array element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sortedArray(arr));
    }
}