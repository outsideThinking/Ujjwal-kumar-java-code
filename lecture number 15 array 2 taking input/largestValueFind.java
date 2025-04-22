import java.util.Scanner;
public class largestValueFind {
    static int largestNum(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int num;
      System.out.print("Enter the array of size ");
      num=sc.nextInt();
      int [] arr=new int[num];
      System.out.print("Enter the array element ");
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
      }
      System.out.print("Largest number is " +largestNum(arr));
  }
}
