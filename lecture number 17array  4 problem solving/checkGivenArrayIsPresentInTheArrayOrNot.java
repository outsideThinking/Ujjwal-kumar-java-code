import java.util.Scanner;

public class checkGivenArrayIsPresentInTheArrayOrNot {
    static boolean checkArray(int[] arr, int num){
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
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
        int num;
        System.out.println("Enter the number and check present ");
        num=sc.nextInt();
        boolean ans= checkArray(arr,num);
        System.out.println(ans);
    }
}

