/* method:2 pre-calculating the horizontal sum of each row in
the matrix
 */
import java.util.Scanner;
public class qn2Method2PreCalculatingTheHorizontalSum {
    static void printArray(int[][] matrix){ // print array of code
        for(int i=0;i<matrix.length;i++){
            System.out.println();
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
    static void prefixSum(int [][] matrix){ //prefix sum of code
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]=matrix[i][j]+matrix[i][j-1];
            }
        }
    }
    static int findSum(int [][] matrix, int r1, int l1, int r2, int l2){
        int sum=0; // find coordinate of sum
        prefixSum(matrix);
        for(int i=l1;i<=l2;i++) {
            if(r1>=1)
            sum = sum + matrix[i][r2] - matrix[i][r1 - 1];
            else
                sum = sum+matrix[i][r2];

        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.print("Enter the size of row ");
        r=sc.nextInt();
        System.out.print("Enter the size of colum ");
        c=sc.nextInt();
        int[][]matrix=new int[r][c];
        System.out.print("Enter the matrix of element ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int l1,r1,l2,r2;
        System.out.print("Enter the first coordinate ");
        l1=sc.nextInt();
        r1=sc.nextInt();
        System.out.print("Enter the second coordinate ");
        l2=sc.nextInt();;
        r2=sc.nextInt();
        System.out.print("Print original matrix ");
        printArray(matrix);
        System.out.println();
        System.out.print("sum of given coordinate ");
        int ans=findSum(matrix,r1,l1,r2,l2);
        System.out.print(ans);
    }
}
