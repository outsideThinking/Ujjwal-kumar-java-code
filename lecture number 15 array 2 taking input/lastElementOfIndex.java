import java.util.Scanner;
public class lastElementOfIndex {
    static int findLastIndex(int [] arr, int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the num ");
        num=sc.nextInt();
        int [] arr=new int[num];
        System.out.print("Enter the array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int x;
        System.out.print("Enter the last element of find index ");
        x=sc.nextInt();
        System.out.print(findLastIndex(arr,x));
    }
}
