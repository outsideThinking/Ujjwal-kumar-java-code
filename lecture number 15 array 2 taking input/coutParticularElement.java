import java.util.Scanner;
public class coutParticularElement {
    static int coutNumber(int [] arr, int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter  the num ");
        num=sc.nextInt();
        int [] arr=new int[num];
        System.out.print("Enter the array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       int x;
        System.out.print("Enter the count element ");
        x=sc.nextInt();
        System.out.print(coutNumber(arr,x));
    }
}
