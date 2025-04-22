import java.util.Scanner;
public class uniqueNumber {
    static int findUniqueNum(int [] arr){ //function create
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the size of array ");
        num=sc.nextInt();
        int [] arr=new int[num];
        System.out.print("Enter the array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(findUniqueNum(arr)); //print unique element
    }
}
