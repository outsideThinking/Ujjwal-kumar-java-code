import java.util.Scanner;
public class findRepeatingValue {
    static int repeating(int [] arr){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    ans=arr[i];
                    return arr[i];
                }
            }
        }
        return -1;
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
        System.out.print(repeating(arr));
    }
}
