import java.util.Scanner;
public class qn3PrintPascalTraningle {
    static int[][] pascal(int  size){ //pascal traingle print of code
        int ans[][]=new int[size][];
        for(int i=0;i<size;i++){
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    static void printArray(int [][]arr){ //print array of code
        for(int i=0;i<arr.length;i++){
            System.out.println();
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter the size of matrix ");
        size=sc.nextInt();
        int [][]ans=pascal(size);
        printArray(ans);
    }
}
