import java.util.Scanner;

public class forEachLoopPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the size of array; ");
        num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the array element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Print the array element using for each loop ");
        for(int b:arr){
            System.out.print(b+" ");
        }
    }
}
