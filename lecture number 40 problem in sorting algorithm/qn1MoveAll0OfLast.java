/*Give an integer array, arr move all 0's to the end of it
while maintaining the relative order of the non-zero elements.
Note:- that you must do this in-place without making a copy
of the array
input: 050342
output: 534200
 */
import java.util.Scanner;
public class qn1MoveAll0OfLast {
    static void moveAll0InLast(int [] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the vaue of size ");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array element ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        moveAll0InLast(arr);
        for(int val:arr){
            System.out.print(val);
        }
    }
}
