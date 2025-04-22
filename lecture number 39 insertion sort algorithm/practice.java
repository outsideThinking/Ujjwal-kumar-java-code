import java.util.Scanner;

class practice{
    static void insertSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while (arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the array of size ");
        num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the array element ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        insertSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}