import java.util.Scanner;
public class sortArrayUsingInsertion {
    static void sortArray(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the value of size ");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array element ");
       for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
       }
       sortArray(arr);
       for(int i:arr){
           System.out.print(i+" ");
       }
    }
}
