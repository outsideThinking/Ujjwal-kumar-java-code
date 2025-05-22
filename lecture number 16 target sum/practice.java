import java.util.Scanner;
class practice{
     static int largest(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
     }
     static int secondLargest(int[] arr){
        int n=arr.length;
        int max=largest(arr);
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                max=Integer.MIN_VALUE;
            }
        }
        int secondLar=largest(arr);
        return secondLar;
     }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array: ");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the aray element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(secondLargest(arr));
    }
}