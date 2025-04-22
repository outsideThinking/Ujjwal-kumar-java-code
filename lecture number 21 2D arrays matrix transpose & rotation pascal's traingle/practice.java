import java.util.Scanner;
public class practice {

    static int[][] pascalTraingle(int n){
        int[][] ans=new int[n][];

        for(int i=-0;i<n;i++){
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }

        return ans;
    }
    static void printArray(int[][] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the size of matrix: ");
        num=sc.nextInt();

        int[][] ans=pascalTraingle(num);
        printArray(ans);
    }
}