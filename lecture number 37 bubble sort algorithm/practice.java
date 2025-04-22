import java.util.Scanner;

class practice{
    static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}